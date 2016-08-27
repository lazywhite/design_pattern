/**
 * PatternType: Structual
 */
public class ProxyPatternDemo{
    public static void main(String[] arg){
        Image image = new ProxyImage("test10.png");

        image.display();
        image.display();
    }
}


