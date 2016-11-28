/**
 * PatterType: Creation
 * 懒汉模式： 类加载时不初始化, 类加载时才初始化， 加载快但访问类的唯一实例慢
 * 饿汉模式： 类加载时就完成了初始化， 类加载较慢但获取对象的速度快
**/
public class SingletonPatternDemo {
    public static void main(String[] args){
        SingleObject obj = SingleObject.getInstance();

        obj.showMessage();
    }
}
