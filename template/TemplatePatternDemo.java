/**
 * Type: Behavioral
 * an abstract class exposes defined ways to execute its methods, its subclass
 * can override the method implementation but the invovation is to be the 
 * same way as defined by abstract class
 */
public class TemplatePatternDemo {
    public static void main(String[] args){
        Game game = new Cricket();
        game.play();

        game = new Football();
        game.play();
    }
}
