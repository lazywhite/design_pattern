/**
 * Type: Structural
 * a composite entity is an EJB entity bean which represent a graph of objects;
 * when a composite entity is updated, internally dependented objects beans get
 * updated automatically as being managed by EJB entity bean
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args){
        Client client = new Client();

        client.setData("test", "data");
        client.printData();

        client.setData("second", "sec02");
        client.printData();
    }
}


