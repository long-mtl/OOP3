package oop3;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {

    private ArrayList<Person> people;

    public PersonList() {
        people = new ArrayList<>();
    }

    public void addPerson(Scanner scanner) {  //chọn 1 trong 2

        System.out.println("Choose type: 1. Student hoac 2. Teacher");
        int choice = Integer.parseInt(scanner.nextLine());
        Person person;

        if (choice == 1) {
            person = new Student();
        } else {
            person = new Teacher();
        }

        person.inputInfo(scanner);
        people.add(person);
        System.out.println("Person added successfully.");
    }

    public boolean deletePersonById(String id) { //nhap id can detele
        for (Person person : people) {
            if (person.id.equals(id)) {
                people.remove(person);
                System.out.println("Person with ID " + id + " removed.");
                return true;
            }
        }
        System.out.println("Person not found.");
        return false;
    }

    public void editPersonById(String id, Scanner scanner) {
        for (Person person : people) {
            if (person.id.equals(id)) {
                person.editPerson(scanner);
                System.out.println("Person with ID " + id + " edited.");
                return;
            }
        }
        System.out.println("Person not found.");
    }

    public void displayAll() {
        if (people.size() == 0) { 
            System.out.println("No people in the list.");
        } else {
            for (int i = 0; i < people.size(); i++) {
                Person person = people.get(i);
                person.displayInfo();
                System.out.println("----------------------");
            }
        }
    }
}
