public abstract class Division {
    String divisionName;
    int accountNumber;
    public Division (String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }
    abstract void display();
}
