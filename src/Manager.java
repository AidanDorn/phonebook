import java.util.LinkedList;
import java.util.Scanner;

public class Manager {
    public static LinkedList<String> phonebook= new LinkedList<>();
    public static int entryCount;
    public static int entryNum;
    public static void add(){
        System.out.println("add");
        Object.setEntry();
        entryCount++;
        entryNum++;
        phonebook.add(Object.getEntry()+entryNum);
    }
    public static void delete(){
        print();
        Scanner scan = new Scanner(System.in);
        System.out.println("Select an entry number to delete");
        int entryNum = scan.nextInt();
        phonebook.remove(entryNum-1);
        entryCount--;
        }
    public static void modify(){
        System.out.println(phonebook);
        Object.changeEntry();
        }
    public static void search(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Search: (f)irst, (m)iddle, or (l)ast");
        String where=scan.nextLine().toLowerCase();
        switch (where) {
            case "f" -> System.out.println(phonebook.getFirst());
            case "m" -> System.out.println(phonebook.get(entryCount/2));
            case "l" -> System.out.println(phonebook.getLast());
            default -> System.out.println("Invalid");
        }
    }
    public static void print() {
        System.out.println(phonebook+"\n");
    }
    public static LinkedList<String> getPhonebook(){
        return phonebook;
    }
}