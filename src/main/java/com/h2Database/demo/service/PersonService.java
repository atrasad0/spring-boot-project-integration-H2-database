package com.h2Database.demo.service;

import com.h2Database.demo.model.Person;
import com.h2Database.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private @Autowired PersonRepository personRepository;

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public void save(Person person) {
        personRepository.save(person);
    }

    public Person find(int id) {
        return personRepository.findById(id).orElse(null);
    }

    public void delete(int id) {
        personRepository.deleteById(id);
    }
}
