public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[10];

        books[0] = new Fiction("Maze Runner");
        books[1] = new Fiction("Scorch Trials");
        books[2] = new Fiction("Death Cure");
        books[3] = new Fiction("Kill Order");
        books[4] = new Fiction("Fever Code");
        books[5] = new Fiction("The Martian");
        books[6] = new Nonfiction("I am Malala");
        books[7] = new Nonfiction("A Promised Land");
        books[8] = new Nonfiction("A Long Walk to Water");
        books[9] = new Nonfiction("Who Was Rosa Parks");

        for (int x = 0; x < books.length; x++){
            String bookTitle = books[x].getTitle();
            double bookPrice = books[x].getPrice();
            System.out.println(bookTitle + ": $" + bookPrice);
        }
    }
}