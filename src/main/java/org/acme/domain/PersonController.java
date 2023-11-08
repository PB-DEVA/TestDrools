package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import org.acme.domain.Person;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

@Path("/person")
public class PersonController {
    @POST
    @Path("/save")
    public void savePerson(@RequestBody Person person){
            
             System.out.println("inside  "+person.getAge());
    }
}
