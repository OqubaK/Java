public class PhysicalNewspaperSubscription extends NewspaperSubscription {
    @Override
    public void setSubAddress(String subAddress) {
        if (subAddress.matches(".*\\d.*")) {
            this.subAddress = subAddress;
            rate = 15.00;
        } else {
            System.out.println("Address is invalid for Physical Newspaper Subscription. Address must contain at least one number.");
            rate = 0;
        }
    }
}
