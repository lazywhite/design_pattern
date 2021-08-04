public class ServiceLoaderPatternDemo {
    public static void main(String[] args){
        try{
        Service service = ServiceLoader.getService("Service1");
        service.execute();
        service = ServiceLoader.getService("Service2");
        service.execute();


        service = ServiceLoader.getService("Service1");
        service.execute();
        service = ServiceLoader.getService("Service2");
        service.execute();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
