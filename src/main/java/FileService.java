//package file.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileService {

    HttpClient client = HttpClient.newBuilder().build();

    public Path downloadFile(String sourceURL) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .uri(new URI(sourceURL))
                .GET()
                .build();
        String fileName = sourceURL.substring(sourceURL.lastIndexOf('/') + 1);

        HttpResponse<InputStream> response = client
                .send(httpRequest, responseInfo ->
                        HttpResponse.BodySubscribers.ofInputStream());

        if (response.statusCode() != 200) {
            throw new RuntimeException("Ошибка при скачивании");
        }

        Path targetPath = new File("src/" + File.separator + fileName).toPath();
        Files.deleteIfExists(targetPath);
        Files.copy(response.body(), targetPath);

        return targetPath;
    }

    public List<String> readFromFile(Path path) throws IOException {

        if (!Files.exists(path)) throw new RuntimeException("Файл не существует");

        return Files.readAllLines(path);
    }

    public void writeToFile(Path path) {
        if (Files.exists(path)) throw new RuntimeException("Файл уже существует");


    }
}
