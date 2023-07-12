public class Nonfiction extends Book{
    public Nonfiction(String title) {
        super(title);
        setPrice();
    }
    @Override
    public void setPrice(){
        super.price = 37.99;
    }
}
