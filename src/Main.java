

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import models.AbstractPerson;
import models.Employee;
import models.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", "Ivanov", 2.67);
        Student s2 = new Student("Amir", "Kurmanbekov", 3.5);
        Employee e1 = new Employee("Rassul", "Turtulov", "Backend", 700000);
        Employee e2 = new Employee("Altynbek", "Kabiev", "engineer", 500000);
        ArrayList<AbstractPerson> people = new ArrayList<>();
        people.add(s1);
        people.add(s2);
        people.add(e1);
        people.add(e2);
        Collections.sort(people);
        printData(people);
    }

    public static void printData(Iterable<AbstractPerson> people){
        for(AbstractPerson person: people){
            printPersonInfo(person);
        }
    }

    public static void printPersonInfo(AbstractPerson person){
        System.out.println(person.toString() + " earns " + person.getPaymentAmount());
    }
}