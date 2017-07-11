public class SingleObject{
    /*
     * 私有无参构造方法, 无法在外部实例化
     */
    private static SingleObject instance = new SingleObject();

    private SingleObject(){};

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello");
    }
}
