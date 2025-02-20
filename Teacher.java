

package oop3;
import java.util.Scanner;
public class Teacher extends Person {
    private String department;

 

    @Override
    public void inputInfo(Scanner scanner) { //nhap thong tin teacher
        super.inputInfo(scanner);
        System.out.print("Enter Department: ");
        department = scanner.nextLine();
    }

    @Override
    public void displayInfo() { //in thong tin teacher
        super.displayInfo();
        System.out.println("Department: " + department);
    }

    @Override
    public boolean editPerson(Scanner scanner) { //chinh sua
        super.editPerson(scanner);
        System.out.print("Edit Department: ");
        department = scanner.nextLine();
        return true;
    }
}
