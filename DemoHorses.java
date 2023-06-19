public class DemoHorses {
    public static void main (String[] args){
        // Making the instances
        Horse FirstHorse = new Horse();
        RaceHorse SecondHorse = new RaceHorse();

        // Setting the attributes
        FirstHorse.setName("Grizzly");
        FirstHorse.setColor("Brown");
        FirstHorse.setBirthYear(2005);
        SecondHorse.setName("Lightning");
        SecondHorse.setColor("Black");
        SecondHorse.setBirthYear(2008);
        SecondHorse.setRaces(10);

        // Printing statements
        System.out.println(FirstHorse.getName() + " is a " + FirstHorse.getColor() + " horse. He was born in " +
                FirstHorse.getBirthYear() + ".");
        System.out.println(SecondHorse.getName() + " is a " + SecondHorse.getColor() + " race horse. He was born in " +
                SecondHorse.getBirthYear() + ", and since then he has won " + SecondHorse.getRaces() + " races.");
    }
}
