package us.digitalasylum.service;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import us.digitalasylum.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class PersonService
{
   @Autowired
   private ObjectifyFactory objectifyFactory;

   public void create()
   {

      Objectify ofy = objectifyFactory.begin();
      ofy().save().entity(new Person(1, "bob", "test", new Date())).now();

   }

}