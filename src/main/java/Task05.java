import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Task05 {
    public static void main(String[] args) throws IOException {

        if (args.length < 1) {
            throw new RuntimeException("Не указан путь к файлу");
        }
        FileService service = new FileService();
        String url = args[0];
        Path downloadedFile;
        try {
            downloadedFile = service.downloadFile(url);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при скачивании файла.");
        }
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<People> myPeoples = Arrays.asList(objectMapper.readValue(Paths.get("src/sample2.json").toFile(), People[].class));
            System.out.println(myPeoples);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
