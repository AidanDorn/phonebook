public class Object {
    //variables for this instance
    private String first;
    private String last;
    private String phoneNumber;
    private String address;
    public Object next;
    //Node class

    public Object(String first, String last, String phoneNumber, String address) {
        this.first = first;
        this.last = last;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.next = null;
    }
    public Object getNext() {//getter method for next
        return next;
    }
    public void setNext(Object newNode) { //setter method for Next node
        this.next = newNode;
    }
    public void setFirst(String first) { //setter method for First
        this.first = first;
    }
    public void setLast(String last) { //setter method for last
        this.last = last;
    }
    public void setPN(String phoneNumber) { //setter method for Phone no.
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address) { //setter method for address
        this.address = address;
    }
    public String getFirst() { //getter method
        return first;
    }
    public String getLast() { //getter method
        return last;
    }
    public void print() {
        System.out.println("First Name: "+first+"\nLast Name: "+last+"\nPhone #: "+phoneNumber+"\nAddress: "+address);
    }
}