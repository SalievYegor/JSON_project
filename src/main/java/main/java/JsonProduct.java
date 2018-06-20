package main.java;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class JsonProduct {
    private List<Product> productList = new LinkedList<Product>();
    private ObjectMapper mapper = new ObjectMapper();


    public List<Product> product(){
        JsonRead jr = new JsonRead("goods");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        mapper.setDateFormat(sdf);
        try{
            Product[] products = mapper.readValue(jr.jsonRead(), Product[].class);
            productList = Arrays.asList(products);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;
    }
}

