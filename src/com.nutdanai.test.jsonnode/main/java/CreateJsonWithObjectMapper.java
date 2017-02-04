import modern.Address;
import modern.Person;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;

public class CreateJsonWithObjectMapper {

    /**
     * Example For solution my task.
     */
    public static void main(String[] args) throws Exception {
	// write your code here
        ObjectMapper mapper = new ObjectMapper();
        String json = CreatedJSON(mapper);
        json = json.replace("Pearl","May");
        System.out.println(json);
        JsonNode jsonNode = mapper.readTree(json);
    }


    public static String CreatedJSON(ObjectMapper mapper) throws IOException{

        Address address = new Address("ACB","Baba","PS");
        Person person = new Person(12,"Pearl",address);
        String json = mapper.writeValueAsString(person);
        System.out.println(json);
        return json;
    }
}
