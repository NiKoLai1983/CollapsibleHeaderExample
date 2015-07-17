package es.jpv.android.examples.collapsibleheaderexample;

import java.util.ArrayList;
import java.util.List;

public class DummyPersons {

    public static List<Person> getPersons() {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Agent Smith", "38"));
        persons.add(new Person("Thomas Anderson", "28"));
        persons.add(new Person("Agent Smith", "38"));
        persons.add(new Person("Thomas Anderson", "28"));
        persons.add(new Person("Agent Smith", "38"));
        persons.add(new Person("Thomas Anderson", "28"));
        persons.add(new Person("Agent Smith", "38"));
        persons.add(new Person("Thomas Anderson", "28"));
        persons.add(new Person("Agent Smith", "38"));
        persons.add(new Person("Thomas Anderson", "28"));
        persons.add(new Person("Agent Smith", "38"));
        persons.add(new Person("Thomas Anderson", "28"));
        persons.add(new Person("Agent Smith", "38"));
        persons.add(new Person("Thomas Anderson", "28"));
        persons.add(new Person("Agent Smith", "38"));
        persons.add(new Person("Thomas Anderson", "28"));
        return persons;
    }

    static class Person {
        String name;
        String age;

        Person(String name, String age) {
            this.name = name;
            this.age = age;
        }
    }
}
