package com.example.mermody.dao;

import com.example.mermody.model.Person;

import java.util.UUID;

public interface PersonDao {

    int isertperson(UUID id , Person person);

    default int isertperson(Person person){
        UUID id = UUID.randomUUID();
        return isertperson(id,person);
    }
}
