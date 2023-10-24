package line_man_wongnai;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(5, "Bob", "Tim","male");
        Person p2 = new Person(12, "Bob", "Aim","male");
        Person p3 = new Person(22, "John", "Smith","male");
        Person p4 = new Person(32, "John", "Audrey","female");
        Person p5 = new Person(50, "Anna", "Audrey","female");

        List<Person> persons = new ArrayList<>();
        persons.add(p);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);
        printPersons(persons);

        System.out.println("------------------------");

        // Answer 16.
        Collections.sort(persons, Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName));
        printPersons(persons);

        System.out.println("------------------------");

        // Answer 17.
        Map<String, List<Person>> personsMapGroupByGender = persons.stream().collect(Collectors.groupingBy(Person::getGender));

        // Answer 18.
        List<Person> personsOver30 = persons.stream().filter(person -> person.getAge() >= 30).toList();
        printPersons(personsOver30);
    }

    public static void printPersons(List<Person> persons){
        for(Person person: persons){
            System.out.println("firstName: "+person.getFirstName()+" lastName: "+person.getLastName());
        }
    }
}
