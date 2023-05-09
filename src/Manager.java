import java.util.*;
public class Manager {
    private Object head;
    private final Scanner input;
    public Manager(){
        this.head = null;
        input = new Scanner(System.in);
    }
    public void menu(Scanner input){
        String begin;
        do{
            System.out.println("""
                    To use this phone book, follow the directions as below:
                    Press 'a' to add contents to the phone book
                    Press 's' to search for a contact in the book
                    Press 'm' to modify existing contacts in the phone bookPress 'd' to delete existing contacts in the phone book
                    Press 'e' to exit the phone book\s""");
            begin = input.next().toLowerCase();
            switch(begin){
                case "a" -> add(input);
                case "s" -> search(input);
                case "m" -> modify(input);
                case "d" -> delete();
                case "e" -> System.out.println("Goodbye");
            }
        }while(!begin.equals("e"));
    }
    private void add(Scanner s){
        System.out.println("Enter first name: ");
        String firstName = s.next().toLowerCase();
        System.out.println("Enter last name: ");
        String lastName = s.next().toLowerCase();
        System.out.println("Enter phone number: ");
        String pNumber = s.next();
        System.out.println("Enter address: ");
        String newAddress = s.next();
        if(head == null)
            head = new Object(firstName, lastName, pNumber, newAddress);
        else{
            Object temporary = head;
            while(temporary.next != null)
                temporary = temporary.next;
            temporary.next = new Object(firstName, lastName, pNumber, newAddress);
        }
    }
    private Object search(Scanner s){
        System.out.println("Enter the first & last name of the contact you wish to view");
        String firstName = s.next().toLowerCase();
        String lastName = s.next().toLowerCase();
        Object search = head;
        System.out.println(search.getFirst().equals(firstName));
        System.out.println(search.getLast().equals(lastName));
        while(!(search.getFirst().equals(firstName) && search.getLast().equals(lastName)))
            search = search.next;
        search.print();
        return search;
    }
    private void modify(Scanner s){
        Object temp = search(input);
        temp.print();
        System.out.println("Which element would you like to modify?\n(f)irst name, (l)ast name, (p)hone number, or (a)ddress:");
        String entry = s.next();
        System.out.println("Enter the new value:");
        switch (entry) {
            case "f" -> temp.setFirst(s.next().toLowerCase());
            case "l" -> temp.setLast(s.next().toLowerCase());
            case "p" -> temp.setPN(s.next().toLowerCase());
            case "a" -> temp.setAddress(s.next().toLowerCase());
            default -> System.out.println("Invalid, retry.");
        }
        temp.print();
    }
    private void delete(){
        Object temporary = search(input);
        Object previous = head;
        if(temporary == head){ //first node delete
            head = head.next;
            temporary.next = null;
        }else if(temporary.next == null){//last node delete
            while(previous.next != temporary)//moves prev to next node until temp
                previous = previous.next;
            previous.next = null;
        }else{
            while(previous.next != temporary)
                previous = previous.next;
            previous.next = temporary.next;
        }
    }
}