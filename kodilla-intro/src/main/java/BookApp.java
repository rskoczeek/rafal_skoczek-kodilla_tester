public class BookApp {
    public static void main(String[] args) {
        String book = "Book of " + Book.author() + ", " + Book.title();

        System.out.println(book);
    }
}
