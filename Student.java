
package oop3;
import java.util.Scanner;
public class Student extends Person {
    private String major;

    public Student() {
    }

    @Override
    public void inputInfo(Scanner scanner) { //nhap thong tin hoc sinh
        super.inputInfo(scanner);
        System.out.print("Enter Major: ");
        major = scanner.nextLine();
    }

    @Override
    public void displayInfo() {  //in ra thong tin hoc sinh
        super.displayInfo();
        System.out.println("Major: " + major);
    }

    @Override
    public boolean editPerson(Scanner scanner) { //chinh sua
        super.editPerson(scanner);
        System.out.print("Edit Major: ");
        major = scanner.nextLine();
        return true;
    }
}
