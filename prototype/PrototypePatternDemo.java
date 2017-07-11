/**
 * PatternType: Creation
 *
 * 初始化不同类型的对象后, 保存在缓存中, 以后再调用此类型, 直接返回缓存中对象的克隆, 重写clone() 方法注意浅拷贝的问题
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
