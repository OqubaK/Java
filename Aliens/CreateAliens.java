public class CreateAliens {
    public static void main(String[] args){
        Martian m = new Martian();
        Jupiterian j = new Jupiterian();

        j.setHeight(123);
        j.setHomePlanet("Jupiter");
        j.setName("erJifsdjk");
        j.setNumberOfEyes(/* Empty as I had a set value for them in the method. */);
        m.setHeight(451);
        m.setHomePlanet("Mars");
        m.setName("Qpfmzjsdfk");
        m.setNumberOfEyes(/* Empty as I had a set value for them in the method. */);

        System.out.println(j.toString());
        System.out.println(m.toString());
    }
}
