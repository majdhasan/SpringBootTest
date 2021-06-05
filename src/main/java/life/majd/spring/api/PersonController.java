package life.majd.spring.api;

import life.majd.spring.model.Person;
import life.majd.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson (@RequestBody Person person){
        personService.insertPerson(person);
    }

    @GetMapping
    public void getAll (){
        personService.getAll();
    }
}
