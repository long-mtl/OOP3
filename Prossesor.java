
package oop3;
import java.util.Scanner;

public class Prossesor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        PersonList personList = new PersonList(); 
        int luachon;

        do {
            System.out.println("LUA CHON");
            System.out.println("1. Add Person"); // nhap 1 de chon 
            System.out.println("2. Edit Person");// nhap 2 de chinh sua thong tin
            System.out.println("3. Delete Person");// nhap 3 de xoa 
            System.out.println("4. Display All");// nhap 4 de in ra
            System.out.println("5. Exit");// nhap 5 de ket thuc
            System.out.print("Choose an option: ");
            
            luachon = Integer.parseInt(scanner.nextLine());

            switch (luachon) {
                case 1:
                    personList.addPerson(scanner); // studen or teacher
                    break;
                case 2:
                    System.out.print("Enter ID to edit: ");
                    String editId = scanner.nextLine();
                    personList.editPersonById(editId, scanner);
                    break; //nhap id
                case 3:
                    System.out.print("Enter ID to delete: ");
                    String deleteId = scanner.nextLine();
                    personList.deletePersonById(deleteId);
                    break;  //id can delete
                case 4:
                    personList.displayAll();
                    break; //in ra thong tin
                case 5:
    
                    System.out.println("Exiting program...");
                    break; //ket thuc
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (luachon != 5);
    }
}
