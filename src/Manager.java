import java.util.LinkedList;
import java.util.Scanner;
public class Manager {
    public static LinkedList<String> phonebook= new LinkedList<>();
    //add, delete, modify, or search for an entry at the  beginning, middle, or end of the node
    // (name, address, city, phone #).  Finally, you should be able to print out your list in a nice format.
    public static void add(){
        System.out.println("add");
        Object.Entry();
        //test
        phonebook.add("John");
        phonebook.add("Sophia");
    }
    public static void delete(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the first name of who you like to delete, or (c)ancel.");
        String input= scan.nextLine();

    }
    public static void modify(){
        System.out.println("modify");
    }
    public static void search(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Search: (f)irst or (l)ast");
        String where=scan.nextLine().toLowerCase();
        if(where.equals("f")){
            System.out.println(phonebook.getFirst());
        } else if(where.equals("m")){
            //phonebook.get();
        } else if (where.equals("l")) {
            System.out.println(phonebook.getLast());
        }else{
            System.out.println("Invalid");
        }
    }
    public static void print() {
        System.out.println(phonebook);
    }
}