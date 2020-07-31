import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

@Path("mis-datos/{id}")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {
    private PersonService service = new PersonService();
    Person me;

    @GET
    public Person get(@PathParam Long id) {
        Person p = service.getPersonById(id);
        return p;
    }

    @POST
    public Person changeMe(Person p) {
        me = p;
        return me;
    }
}
