public abstract class Alien {
    protected int  height;
    protected String name;
    String homePlanet;
    int numberOfEyes;

    public void setHeight(int h){
        this.height = h;
    }
    public void setName(String n){

        this.name = n;
    }
    public void setHomePlanet(String hp){
        this.homePlanet = hp;
    }
    public void setNumberOfEyes(int e){
        this.numberOfEyes = e;
    }
    public int getHeight(){
        return  height;
    }
    public String getName(){
        return name;
    }
    public String getHomePlanet(){
        return homePlanet;
    }
    public int getNumberOfEyes(){
        return numberOfEyes;
    }
    public String toString(){
        return name + " is from " + homePlanet + ". It is " + height + "cm, and has " + numberOfEyes + " eyes.";
    }

    public abstract void setNumberOfEyes();
}
