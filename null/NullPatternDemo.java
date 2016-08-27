/**
 * Type: Behavioral
 * Instead of putting if check for a null value, Null Object reflects a do 
 * nothing relationship
 */
public class NullPatternDemo {
    public static void main(String[] args){
        AbstractCustomer c1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer c2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer c3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer c4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());
        System.out.println(c4.getName());
    }
}

