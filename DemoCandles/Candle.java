public class Candle {
    String color;
    int height;
    Double price;

    public void setColor(String c){
        this.color = c;
    }
    public void setHeight(int h){
        this.height = h;
    }
    public String getColor(){
        return color;
    }
    public int getHeight(){
        return height;
    }
    public Double getPrice(){
        price = height * 2.0;
        return price;
    }
}
