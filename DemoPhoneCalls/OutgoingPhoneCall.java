public class OutgoingPhoneCall extends PhoneCall{
    double pricePerMinute = 0.4;
    int minutes;
    public OutgoingPhoneCall(String phoneNumber, int minutes) {
        super(phoneNumber);
        this.minutes = minutes;
        setPrice(pricePerMinute * minutes);
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
        return "Outgoing call. \nNumber: " + getPhoneNumber() + " Rate: $" + pricePerMinute + " " + minutes +
                " minutes long. Total: $" + getPrice() + "\n";
    }
}
