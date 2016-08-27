public class Stock{
    private String name = "ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Buy Stock: " + name + " " + quantity);
    }

    public void sell(){
        System.out.println("Sell Stock: " + name + " " + quantity);
    }
}

