/*
 * type: Structure
 *
 * 隐藏系统的复杂性, 用户无需处理复杂的内部流程
 * 直接使用提供的接口
 *
 */
public class FacadePatternDemo{
    public static void main(String[] args){
        ShapeMaker sm = new ShapeMaker();

//        sm.drawCircle();
//        sm.drawSquare();
//        sm.drawRectangle();
        sm.drawAllShape();
    }
}

