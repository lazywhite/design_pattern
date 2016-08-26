/**
 * PatternType: Creation
**/
public class PrototypePatternDemo {
    public static void main(String[] args) {
        try{
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("circle");
        System.out.println("Shape: " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("square");
        System.out.println("Shape: " + clonedShape2.getType());
        
        Shape clonedShape3 = (Shape) ShapeCache.getShape("rectangle");
        System.out.println("Shape: " + clonedShape3.getType());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
