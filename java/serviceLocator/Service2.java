public class Service2 implements Service {
    @Override
    public void execute(){
        System.out.println("Executing service 02");
    }

    @Override
    public String getName(){
        return "Service2";
    }
}
