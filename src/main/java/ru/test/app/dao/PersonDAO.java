package ru.test.app.dao;

import ru.test.app.models.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDAO {

    private static int PEOPLE_COUNT = 0;
    private List<Person> people;
    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Hobs"));
        people.add(new Person(++PEOPLE_COUNT, "James"));
        people.add(new Person(++PEOPLE_COUNT, "Dory"));
        people.add(new Person(++PEOPLE_COUNT, "Flora"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
