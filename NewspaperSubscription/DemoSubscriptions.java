public class DemoSubscriptions {
    public static void main(String[] args) {
        OnlineNewspaperSubscription max = new OnlineNewspaperSubscription();
        max.setName("Max");
        max.setSubAddress("max@gmail.com");
        System.out.println(max.getSubName() + " (" + max.getAddress() + ") is a subscriber of the Online Newspaper." +
                " It costs $" + max.getRate());

        OnlineNewspaperSubscription badOS = new OnlineNewspaperSubscription();
        badOS.setName("Jack");
        badOS.setSubAddress("jack2gmail.com");
        System.out.println(badOS.getSubName() + " (" + badOS.getAddress() + ") is a subscriber of the Online Newspaper. " +
                "It costs $" + badOS.getRate());

        PhysicalNewspaperSubscription john = new PhysicalNewspaperSubscription();
        john.setName("John");
        john.setSubAddress("123 Main Street");
        System.out.println(john.getSubName() + " (" + john.getAddress() + ") is a subscriber of the Physical Newspaper. " +
                "It costs $" + john.getRate());

        PhysicalNewspaperSubscription badPS = new PhysicalNewspaperSubscription();
        badPS.setName("Mozilla");
        badPS.setSubAddress("Main Street");
        System.out.println(badPS.getSubName() + " (" + badPS.getAddress() + ") is a subscriber of the Physical Newspaper. " +
                "It costs $" + badPS.getRate());
    }
}
