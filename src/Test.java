import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int active=0;
        while (active == 0) {
            System.out.println("Enter a command:\n(a)dd, (d)elete, (m)odify, (s)earch, (p)rint, or (t)erminate");
            String command = scan.nextLine().toLowerCase();
            if (command.equals("a")) {
                Manager.add();
            } else if (command.equals("d")) {
                Manager.delete();
            } else if (command.equals("m")) {
                Manager.modify();
            } else if (command.equals("s")) {
                Manager.search();
            } else if (command.equals("p")) {
                Manager.print();
            } else if (command.equals("t")) {
                System.out.println("Terminating program...");
                active = 1;
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}