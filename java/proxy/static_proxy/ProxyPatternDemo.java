/**
 * PatternType: Structual
 * 
 * 为被代理对象提供访问控制
 *
 * 静态代理
 *     被代理对象要实现某些接口
 *     代理类要实现被代理对象的接口, 不够灵活
 *
 */
public class ProxyPatternDemo{
    public static void main(String[] arg){
        Image image = new ProxyImage("test10.png");

        image.display();
    }
}


