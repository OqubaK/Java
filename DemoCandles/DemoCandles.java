public class DemoCandles {
    public static void main(String[] args){
        // Making the instances
        Candle c = new Candle();
        ScentedCandles s = new ScentedCandles();

        // Setting the attributes
        c.setColor("White");
        c.setHeight(5);
        s.setColor("Brown");
        s.setHeight(8);
        s.setScent("Chocolate");

        // Displaying details
        System.out.println("For $" + c.getPrice() + ", you can get this " + c.getHeight() + " inch, " + c.getColor() +
                " Candle");
        System.out.println("For $" + s.getPrice() + ", you can get this " + s.getScent() + " scented candle. It is " +
                s.getColor() + " and " + s.getHeight() + " inches tall.");
    }
}
