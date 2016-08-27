/**
 * Type: Behavioral
 */
public class StrategyPatternDemo {
    public static void main(String[] args){
        Context context = new Context(new AddOperation());
        System.out.println("10 + 5 = : " + context.executeStrategy(10, 5));

        context = new Context(new SubstractOperation());
        System.out.println("10 - 5 = : " + context.executeStrategy(10, 5));

        context = new Context(new MultiplyOperation());
        System.out.println("10 * 5 = : " + context.executeStrategy(10, 5));
    }
}
