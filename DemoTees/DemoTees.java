public class DemoTees {
    public static void main(String[] args){
        // Making the instances
        TeeShirt xl = new TeeShirt();
        TeeShirt s = new TeeShirt();
        CustomTee cxl = new CustomTee();
        CustomTee cs = new CustomTee();

        // Setting attributes for XL shirt
        xl.setOrderNumber("123");
        xl.setColor("Red");
        xl.setSize("XL");

        // Setting attributes for S shirt
        s.setOrderNumber("124");
        s.setColor("Blue");
        s.setSize("S");

        // Setting attributes for XL custom shirt
        cxl.setOrderNumber("125");
        cxl.setColor("Black");
        cxl.setSize("XL");
        cxl.setSlogan("Hello, World!");

        // Setting attributes for S custom shirt
        cs.setOrderNumber("126");
        cs.setColor("White");
        cs.setSize("S");
        cs.setSlogan("Java! Woo!");

        // Printing
        System.out.println("Order #" + xl.getOrderNumber() + " is a " + xl.getSize() + " " + xl.getColor() +
                " shirt. $" + xl.getPrice());
        System.out.println("Order #" + s.getOrderNumber() + " is a " + s.getSize() + " " + s.getColor() +
                " shirt. $" + s.getPrice());
        System.out.println("Order #" + cxl.getOrderNumber() + " is a " + cxl.getSize() + " " + cxl.getColor() +
                " shirt with \"" + cxl.getSlogan() + "\" written on it. $" + cxl.getPrice());
        System.out.println("Order #" + cs.getOrderNumber() + " is a " + cs.getSize() + " " + cs.getColor() +
                " shirt with \"" + cs.getSlogan() + "\" written on it. $" + cs.getPrice());
    }
}
