import modern.Address;
import modern.Person;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Nutdanai on 2/4/2017.
 */
public class WriteJsonWithObjectMapper {

    public static void main(String[] args) throws  IOException {
        ObjectMapper mapper = new ObjectMapper();
        Address address = new Address("CCD","Goggle","DS");
        Person person = new Person(23,"Maven",address);
        mapper.writeValue(new File("D:/dataOne.json"),person);
        System.out.println("--Done--");
    }
}
