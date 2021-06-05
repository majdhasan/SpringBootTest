package life.majd.spring.dao;

import life.majd.spring.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao{
    private static List<Person> DB = new ArrayList<>();
    java.util.logging.Logger logger =  java.util.logging.Logger.getLogger(this.getClass().getName());

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        logger.info("Person was succefully been added: " + id +" " + person.getName());
        return 0;
    }

    public String getAll(){
        return DB.toString();
    }

}
