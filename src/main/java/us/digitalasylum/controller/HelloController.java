package us.digitalasylum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import us.digitalasylum.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class HelloController
{
  @Autowired
  private PersonService personService;

	@RequestMapping(value = "/guestbook", method = RequestMethod.GET)
	public String index(ModelMap model) {
 
		return "guestbook";
 
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
    personService.create();
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";
 
	} 
}