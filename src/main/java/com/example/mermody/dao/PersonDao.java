package com.example.mermody.dao;

import com.example.mermody.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int isertperson(UUID id , Person person);

    default int isertperson(Person person){
        UUID id = UUID.randomUUID();
        return isertperson(id,person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
