/**
 * PatternType: Structual
 *
 * 将对象作为参数传递给装饰器, 返回一个装饰后的对象
 * 用来替代继承, 目的是增强类功能
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
