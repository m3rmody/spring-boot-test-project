package com.example.mermody.dao;

import com.example.mermody.model.Person;
import org.springframework.objenesis.instantiator.annotations.Instantiator;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao{

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int isertperson(UUID id, Person person) {
        DB.add(new Person(id,person.getName()));
        return 1;
    }
}
