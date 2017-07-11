/**
 * Type: Behavioral
 *
 * 观察者初始化时传递进对象, 并将自己添加进对象的观察者列表
 * 对象更新状态时, setter()方法会遍历自己的观察者列表, 调用其update()方法
 * 观察者在update()里面获取对象新的属性
 */
public class ObserverPatternDemo {
    public static void main(String[] args){
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);


        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
