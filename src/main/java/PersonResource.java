import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("mis-datos")
public class PersonResource {
    Person me = new Person("Andrea", "Velasquez", 19);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person me() {
        return this.me;
    }
}
