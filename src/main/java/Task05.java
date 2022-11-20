import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Task05 {
    public static void main(String[] args) throws IOException {
        //String url = args[0];
        ObjectMapper objectMapper = new ObjectMapper();
        List<People> myPeoples = Arrays.asList(objectMapper.readValue(Paths.get("src/sample2.json").toFile(), People[].class));
        System.out.println(myPeoples);


    }
}
