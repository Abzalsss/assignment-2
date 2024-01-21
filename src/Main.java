

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
        Student student1 = new Student("Nikitav", "Bobylev", 2.43);
        Student student2 = new Student("Merey", "Ibraim", 3.55);
        Employee employee1 = new Employee("Alip", "Kenzhebek", "Businessman", 650000);
        Employee employee2 = new Employee("Ulan", "Torebek", "Military Officer", 250000);
        ArrayList<AbstractPerson> people = new ArrayList<>();
        people.add(student1);
        people.add(student2);
        people.add(employee1);
        people.add(employee2);
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