package br.com.demo.service;

import br.com.demo.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    public AtomicLong counter = new AtomicLong();
    public Logger logger = Logger.getLogger(PersonService.class.getName());
    private List<Person> persons = new ArrayList<Person>();
    public Person findById(Long id) {
        logger.info("Finding person with id: " + id);
        Person person = new Person();
        // Mock
        person.setId(counter.incrementAndGet());
        person.setFirstName("Claudio");
        person.setLastName("Cabral");
        person.setAddress("Rua Carmela 111");
        person.setGender("Male");

        return person;
    }

    // Retornando uma lista de pessoas

    public List<Person> findByAll() {

        for(int i=0; i<=8; i++) {
          Person person = mockPerson(i);
          persons.add(person);
        }

        return persons;
    }

    public Person mockPerson(int i){

        Person personMock = new Person();
        personMock.setId(counter.incrementAndGet());
        personMock.setFirstName("FirstName" + i);
        personMock.setLastName("LastName" + i);
        personMock.setAddress("Address" + i);
        personMock.setGender("Male");

        return personMock;
    }
}
