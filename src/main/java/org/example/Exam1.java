package org.example;
import org.example.model.Root;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class Exam1 {
    public Root parse(){
        Root root = new Root();
        JSONParser parse = new JSONParser();

        try (FileReader fr = new FileReader("Exam1.json")){
            JSONObject jsonObj = (JSONObject)parse.parse(fr);
            String name = (String) jsonObj.get("name");
            String country = (String) jsonObj.get("country");
            String city = (String) jsonObj.get("city");
            String age = (String) jsonObj.get("age");
            root.setName(name);
            root.setCountry(country);
            root.setCity(city);
            root.setAge(age);
            return root;

        } catch (Exception e) {
            System.out.println("Parsing error " + e.toString());
        }
        return null;
    }

    StringBuilder WHERE = new StringBuilder();

}
