import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        boolean active= true;
        System.out.println("Welcome to the Phone Book program.\nPress 'a' to add a contact.");
        System.out.println("Press 'd' to delete a contact.\nPress 'm' to modify an existing contact.");
        System.out.println("Press 'f' to find a specific contact.\nPress 's' to save current phone book to file.");
        System.out.println("Press 'i' to import an existing calendar.\nPress 't' to exit the program.");

        while (active == true) {
            System.out.println("Enter a command:\n(a)dd, (d)elete, (f)ind, (m)odify, (p)rint, (s)ave, (i)mport, or (t)erminate");
            String command = scan.nextLine().toLowerCase();
            switch (command) {
                case "a" -> Manager.add();
                case "d" -> Manager.delete();
                case "m" -> Manager.modify();
                case "f" -> Manager.search();
                case "i" -> Manager.upload();
                case "p" -> Manager.print();
                case "s" -> Manager.save();
                case "t" -> {
                    active = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid input");
            }
        }
    }
}