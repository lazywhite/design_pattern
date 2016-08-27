/**
 * PatternType: Behavioral
 * reduce communication complexity between muliple objects or classes
 * this pattern provides a mediator class which normally handles all the
 * communication between different classes and support easy maintenance
 * of the code by loose coupling;
 */
public class MediatorPatternDemo {
    public static void main(String[] args){
        User robert = new User("Robbert");
        User john = new User("John");

        robert.sendMessage("Hi! everybody");
        john.sendMessage("Hi, robbert");
    }
}


