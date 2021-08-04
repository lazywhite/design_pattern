public class Cricket extends Game {
    @Override
    void endPlay(){
        System.out.println("Cricket Game Finished");
    }

    @Override
    void startPlay(){
        System.out.println("Cricket Game Started");
    }

    @Override
    void initialize(){
        System.out.println("Cricket Game initialized");
    }
}

