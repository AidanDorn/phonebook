import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int active=0;
        while (active == 0) {
            System.out.println("Enter a command:\n(a)dd, (d)elete, (m)odify, (s)earch, (p)rint, or (t)erminate");
            String command = scan.nextLine().toLowerCase();
            switch (command) {
                case "a" -> Manager.add();
                case "d" -> Manager.delete();
                case "m" -> Manager.modify();
                case "s" -> Manager.search();
                case "p" -> Manager.print();
                case "t" -> active = 1;
                default -> System.out.println("Invalid input");
            }
        }
    }
}