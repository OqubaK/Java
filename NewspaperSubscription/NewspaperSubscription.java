public abstract class NewspaperSubscription {
    String subName;
    String subAddress;
    double rate;

    public void setName(String name) {
        this.subName = name;
    }
    public String getSubName() {
        return subName;
    }
    public abstract void setSubAddress(String address);
    public String getAddress() {
        return subAddress;
    }
    public double getRate() {
        return rate;
    }

}
