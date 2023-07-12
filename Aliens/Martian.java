public class Martian extends Alien {

    // Overriding so that I can have a set number of eyes for them
    @Override
    public void setNumberOfEyes(){
        this.numberOfEyes = 4;
    }
}
