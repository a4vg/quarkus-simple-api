import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

@Path("mis-datos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {
    Person me;

    public PersonResource() {
        Address address = new Address("Peru","Lima", "Machu Picchu", "123" );
        this.me = new Person("Andrea", "Velasquez", 19, address);
    }

    @GET
    public Person me() {
        return me;
    }

    @POST
    public Person changeMe(Person p) {
        me = p;
        return me;
    }
}
