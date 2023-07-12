public abstract class Book {
    String title;
    double price;

    public Book(String title) {
        this.title = title;
    }

    public abstract void setPrice();

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }
}
