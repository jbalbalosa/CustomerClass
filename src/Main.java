public class Main {
    public static void main(String[] args) {
             Customer customerBob = new Customer("Bob",2000,"bob@email.com");
        System.out.println(customerBob.getCustomerName());
        System.out.println(customerBob.getCreditLimit());
        System.out.println(customerBob.getEmailAddress());

        Customer customerJeff = new Customer();
        System.out.println(customerJeff.getCustomerName());
        System.out.println(customerJeff.getCreditLimit());
        System.out.println(customerJeff.getEmailAddress());

        Customer thirdCustomer = new Customer("joe","joe@email.com");
        System.out.println(thirdCustomer.getCustomerName());
        System.out.println(thirdCustomer.getCreditLimit());
        System.out.println(thirdCustomer.getEmailAddress());
    }
}
