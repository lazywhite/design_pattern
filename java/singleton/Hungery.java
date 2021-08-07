/**
 * PatterType: Creation
 * 懒汉模式： 类加载时不初始化, 类加载时才初始化， 加载快但访问类的唯一实例慢
 * 饿汉模式： 类加载时就完成了初始化， 类加载较慢但获取对象的速度快
**/

class SingleObject{
    /*
     * 私有无参构造方法, 无法在外部实例化
     */
    //饿汉模式
    private static SingleObject instance = new SingleObject();

    private SingleObject(){};

    public static SingleObject getInstance(){
        return instance;
    }
}

public class Hungery {
    public static void main(String[] args){
        SingleObject obj1 = SingleObject.getInstance();
        SingleObject obj2 = SingleObject.getInstance();

        System.out.println(obj1 == obj2);

    }
}
