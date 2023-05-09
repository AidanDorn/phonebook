public class Object {
    private String first;
    private String last;
    private String phoneNumber;
    private String address;
    public Object next;
    public Object(String first, String last, String phoneNumber, String address){
        this.first = first;
        this.last = last;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.next = null;
    }
    public void setFirst(String first){ //setter method for
        this.first = first;
    }
    public void setLast(String last){ //setter method for
        this.last = last;
    }
    public void setPN(String phoneNumber){ //setter method for
        this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address){ //setter method for
        this.address = address;
    }
    public String getFirst(){ //getter method
        return first;
    }
    public String getLast(){ //getter method
        return last;
    }
    public void print(){
        System.out.println("First name: " + first+ "\nLast name: " + last);
        System.out.println("Phone number: " + phoneNumber+"\nAddress: " + address);
    }
}