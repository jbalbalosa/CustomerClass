package PACKAGE_NAME;

public class Customer {
    private String customerName;
    private double creditLimit;
    private  String emailAddress;

    //No args Constructor
    public Customer(){
//        this("default name",500,"default email");
//        System.out.println("Empty constructor called");

        this("default name","default email");

    }

    //Second constructor
    public Customer(String customerName, String emailAddress){
        this(customerName,1000,emailAddress);
    }

    public Customer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

