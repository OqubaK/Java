public class InternationalDivision extends Division {
    String country;
    String language;
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    public void display(){
        System.out.println(divisionName + " is located in the country of " + country + ". They speak the language(s) "
        + language + ". Account number: " + accountNumber);
    }
}
