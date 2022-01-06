package controller;
import model.Person;

import java.util.ArrayList;
import java.util.List;
public class StudentController {
	List<Person> persons;
    public StudentController() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public void showInfor() {
        this.persons.forEach(person -> System.out.println(person.toString()));
    }

    public Person searchById(String id) {
        return this.persons.stream().filter(candidate -> candidate.getId().equals(id)).findFirst().orElse(null);
    }

}
