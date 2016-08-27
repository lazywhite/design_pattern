/**
 * PatternType: Structual
 */
public class DecoratorPatternDemo{
    public static void main(String[] args){
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal bordor");
        circle.draw();
        System.out.println("Circle with red bordor");
        redCircle.draw();
        System.out.println("Rectangle with red bordor");
        redRectangle.draw();
    }
}
