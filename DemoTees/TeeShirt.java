public class TeeShirt {
    String orderNumber;
    String size;
    String color;
    Double price;

    public void setOrderNumber(String o){
        this.orderNumber = o;
    }
    public void setSize(String s){
        this.size = s;
    }
    public void setColor(String c){
        this.color = c;
    }
    public String getOrderNumber(){
        return orderNumber;
    }
    public String getSize(){
        return size;
    }
    public String getColor(){
        return color;
    }
    public Double getPrice(){
        if (size == "XL" || size == "XXL"){
            return 22.99;
        }else{
            return 19.99;
        }
    }
}
