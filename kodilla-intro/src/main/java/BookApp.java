public class BookApp {
    public static void main(String[] args) {
        Book book = Book.of("Sienkiewicz", "Ogniem i mieczem");
        Book biblia = Book.of("Bibilia");
        System.out.println(biblia);
        System.out.println(book);
    }
}
