public class OnlineNewspaperSubscription extends NewspaperSubscription {
    @Override
    public void setSubAddress(String subAddress) {
        if (subAddress.contains("@")) {
            this.subAddress = subAddress;
            rate = 9.00;
        } else {
            System.out.println("Invalid address for Online Newspaper Subscription. Address must contain \"@\"");
            rate = 0;
        }
    }
}
