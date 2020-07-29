import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("mis-datos")
public class PersonResource {
    Person me;

    public PersonResource() {
        Address address = new Address("Peru","Lima", "Machu Picchu", "123" );
        this.me = new Person("Andrea", "Velasquez", 19, address);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person me() {
        return this.me;
    }
}
