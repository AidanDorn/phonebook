import java.util.*;
public class Manager {
    private Object head;
    private final Scanner input;
    public Manager() {
        this.head = null;
        input = new Scanner(System.in);
    }
    public void menu(Scanner input) { //start of menu
        String begin;
        do {
            System.out.println("To use this phone book, follow the directions as below: ");
            System.out.println("""
                    (a)dd contents to the phone book
                    (s)earch for a contact in the book
                    (m)odify existing contacts in the phone book
                    (d)elete existing contacts in the phone book
                    (e)xit the phone book""");
            begin = input.next().toLowerCase();
            switch (begin) {
                case "a" -> add(input);
                case "s" -> search(input);
                case "m" -> modify(input);
                case "d" -> delete();
                case "e" -> begin = "e";
            }
        } while (!begin.equals("e"));
    }
    private void add(Scanner scan) {
        System.out.println("Type first name: ");
        String firstName = scan.next().toLowerCase();
        System.out.println("Type last name: ");
        String lastName = scan.next().toLowerCase();
        System.out.println("Type phone number: ");
        String pNumber = scan.next();
        System.out.println("Type address: ");
        String newAddress = scan.next();
        if (head == null)
            head = new Object(firstName, lastName, pNumber, newAddress);
        else {
            Object temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = new Object(firstName, lastName, pNumber, newAddress);
        }
    }
    private Object search(Scanner s) {
        System.out.println("Type the first & last name of the contact");
        String firstName = s.next().toLowerCase();
        String lastName = s.next().toLowerCase();
        Object search = head;
        while (!(search.getFirst().equals(firstName) && search.getLast().equals(lastName)) || search.next != null)
            search = search.next;
        search.print();
        return search;
    }
    private void modify(Scanner s) {
        Object temp = search(input);
        temp.print();
        System.out.println("""
                To change first name press 'f'
                To change last name press 'l'
                To change phone # press 'p'
                To change address press 'a'""");
        String entry = s.next().toLowerCase();
        switch (entry) {
            case "f" -> temp.setFirst(s.next().toLowerCase());
            case "l" -> temp.setLast(s.next().toLowerCase());
            case "p" -> temp.setPN(s.next().toLowerCase());
            case "a" -> temp.setAddress(s.next().toLowerCase());
            default -> System.out.println("command not recognized");
        }
        temp.print();
    }
    private void delete() {//next node delete
        Object temp = search(input);
        if (temp == head) {
            head = head.next;
            temp.next = null;
        } else if (temp.next == null) {//last node delete
            Object prev = head;
            while (prev.next != temp) {//moves prev to next node until temp
                prev = prev.next;
                prev.next=null;
            }
        }
        else{
            while
        }
    }
}