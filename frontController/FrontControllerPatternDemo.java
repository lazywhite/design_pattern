public class FrontControllerPatternDemo {
    public static void main(String[] args){
        FrontController fc = new FrontController();
        fc.dispatchRequest("HOME");
        fc.dispatchRequest("STUDENT");
    }
}

