package life.majd.spring.dao;

import life.majd.spring.model.Person;

import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    String getAll();

    default int addPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);
    }


}
