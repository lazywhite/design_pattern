public class Football extends Game {
    @Override
    void endPlay(){
        System.out.println("Football Game Finished");
    }

    @Override
    void startPlay(){
        System.out.println("Football Game Started");
    }

    @Override
    void initialize(){
        System.out.println("Football Game initialized");
    }
}

