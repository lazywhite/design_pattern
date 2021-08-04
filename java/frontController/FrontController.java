public class FrontController{
    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher = new Dispatcher();
    }

    private boolean isAuthenticated(){
        System.out.println("User is authenticated!");
        return true;
    }

    private void trackRequest(String request){
        System.out.println("Page Requested: " + request);
    }

    public void dispatchRequest(String request){
        trackRequest(request);

        if(isAuthenticated()){
            dispatcher.dispatch(request);
        }
    }
}


