public class DomestincDivision extends Division {
    String state;
    public DomestincDivision (String divisionName, int accountNumber, String state){
        super(divisionName, accountNumber);
        this.state = state;
    }

    public void display() {
        System.out.println(divisionName + " is in the state of " + state + ". Account number: " + accountNumber);
    }
}
