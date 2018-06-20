package main.java;

import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class JsonRead {

    private String fileName;

    public String jsonRead() {

        Path filePath = Paths.get("src/main/java/resources/" + fileName + ".json");
        String jsonObject = "";
        List<Product> productList = new LinkedList<Product>();
        try{
            jsonObject = new String(Files.readAllBytes(filePath));
        }catch (IOException e){
            System.out.println("cant read file: " + e);
        }
        return jsonObject;
    }
}
