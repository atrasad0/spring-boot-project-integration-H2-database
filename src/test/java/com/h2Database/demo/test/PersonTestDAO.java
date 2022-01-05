package com.h2Database.demo.test;

import com.h2Database.demo.config.DataBaseTestsSpringConfig;
import com.h2Database.demo.model.Person;
import com.h2Database.demo.service.PersonService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { DataBaseTestsSpringConfig.class })
public class PersonTestDAO {

    private @Autowired PersonService personService;

    @Test
    @Transactional
    public void testePersonDAO() {
        // INSERT
        var person = new Person("Victor");
        personService.save(person);
        assertNotNull(person.getId());

        // FIND
        var finded = personService.find(person.getId());
        assertNotNull(finded);

        //FIND ALL
        var persons = personService.findAll();
        assertNotNull(persons);
        assertFalse(persons.isEmpty());

        //DELETE
        personService.delete(person.getId());
        assertNull(personService.find(person.getId()));
    }
}
