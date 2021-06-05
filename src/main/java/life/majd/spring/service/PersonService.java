package life.majd.spring.service;

import life.majd.spring.dao.PersonDao;
import life.majd.spring.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.stereotype.Service;

import java.sql.Struct;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int insertPerson(Person person){
    return personDao.addPerson(person);
    }

    public String getAll(){
        return personDao.getAll();
    }
}
