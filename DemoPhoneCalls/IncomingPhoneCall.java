public class IncomingPhoneCall extends PhoneCall{
    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        setPrice(0.2);
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getInformation() {
        return "Incoming call. \nNumber: " + getPhoneNumber() + " Rate: " + getPrice() + " Cost: " + getPrice() + "\n";
    }
}
