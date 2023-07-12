public class UseDivision {
    public static void main (String[] args) {
        InternationalDivision i = new InternationalDivision("Microsoft India", 10320,
                "India", "Hindi/English");
        DomestincDivision m = new DomestincDivision("Microsoft Detroit", 10021,
                "Michigan");

        i.display();
        m.display();
    }
}
