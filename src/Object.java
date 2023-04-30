public class Object {
    static String firstName;
    static String lastName;
    static String address;
    static String city;
    static int phoneNum;
    static int zip;
    static int entryNum;
    static String s=" ";
    static String cs=", ";
    //Generates entry based on input
    public static String Entry(){
        String entry=firstName+s+lastName+cs+address+cs+city+cs+zip+cs+phoneNum+cs+"Entry num: "+entryNum;
        return entry;
    }
}