/**
 * PatternType: Structual
 *
 * 获取对象时, 不新创建一个对象, 而是重新利用一个缓存过的对象
 */
public class FlyweightPatternDemo{
    private static final String[] colors = {"red", "green", "blue", "white"};

    public static void main(String[] args){
        for(int i=0; i<20; ++i){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor(){
        return colors[(int)(Math.random() * colors.length)];
    }
    private static int getRandomX(){
        return (int)(Math.random() * 100);
    }
    private static int getRandomY(){
        return (int)(Math.random() * 100);
    }
}
