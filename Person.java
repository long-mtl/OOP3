
package oop3;
import java.util.Date;
import java.util.Scanner;

public class Person {
    protected String id;
    protected String homeTown;
    protected Date dateOfBirth;

    public Person() {
    }

    public Person(String id, String homeTown, Date dateOfBirth) {
        this.id = id;
        this.homeTown = homeTown;
        this.dateOfBirth = dateOfBirth;
    }

    public void inputInfo(Scanner scanner) { //nhap thong tin
        System.out.print("Enter ID: ");
        id = scanner.nextLine();
        System.out.print("Enter Hometown: ");
        homeTown = scanner.nextLine();
        System.out.print("Enter Date of Birth (yyyy-mm-dd): ");
        dateOfBirth = java.sql.Date.valueOf(scanner.nextLine());
    }

    public void displayInfo() {  //hien thi thong tin
        System.out.println("ID: " + id);
        System.out.println("Hometown: " + homeTown);
        System.out.println("Date of Birth: " + dateOfBirth);
    }

    public boolean editPerson(Scanner scanner) { //chinh sua
        System.out.print("Edit Hometown: ");
        homeTown = scanner.nextLine();
        System.out.print("Edit Date of Birth (yyyy-mm-dd): ");
        dateOfBirth = java.sql.Date.valueOf(scanner.nextLine()); //nhan dinh dang "yyyy-mm-dd"
        return true;
    }
}
