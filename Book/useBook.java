public class useBook {
    public static void main(String[] args){
        Fiction MR = new Fiction("Maze Runner");
        Nonfiction Dictionary = new Nonfiction("The Dictionary");

        System.out.println(MR.title + " costs $" + MR.price +
                "\n" + Dictionary.title + " costs $" + Dictionary.price);
    }
}
