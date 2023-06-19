public class ScentedCandles extends Candle {
    String scent;

    public void setScent(String s){
        this.scent = s;
    }
    public String getScent(){
        return scent;
    }
    @Override
    public Double getPrice(){
        price = height * 3.0;
        return price;
    }
}
