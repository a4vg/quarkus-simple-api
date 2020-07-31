import java.io.FileReader;
import java.io.FileNotFoundException;

import javax.json.JsonReader;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.json.bind.JsonbConfig;

public class PersonService {
    private String filename = "{REPLACE_WITH_PATH_TO}/simple-api/src/main/resources/people.json";
    private JsonArray people;

    PersonService() {
        JsonReader jsonReader;
        try {
            jsonReader = Json.createReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            System.out.println(filename + " not found");
            return;
        }

        people = jsonReader.readArray();
    }

    Person getPersonById(Long id) {
        Jsonb jsonb = JsonbBuilder.create(new JsonbConfig());


        for (int i = 0; i < people.size(); i++) {
            String obj = people.getJsonObject(i).toString();
            Person person = jsonb.fromJson(obj, Person.class);
            if (id.equals(person.getId()))
                return person;
        }

        return new Person();
    }
}
