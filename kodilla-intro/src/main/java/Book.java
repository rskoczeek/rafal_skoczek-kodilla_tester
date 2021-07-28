import java.util.Scanner;
public class Book {
    public static String author() {
        Scanner scanner = new Scanner(System.in);                 // [1]
        while (true) {                                            // [2]
            System.out.println("Enter authors full name:");                // [3]
            String fullName = scanner.nextLine().trim();               // [4]
            if (fullName.length() >= 2) {                              // [5]
                return fullName;                                        // [6]
            }
            System.out.println("Name is too short. Try again.");
        }
    }
    public static String title() {
        Scanner scanner = new Scanner(System.in);                 // [1]
        while (true) {                                            // [2]
            System.out.println("Enter books title:");                // [3]
            String title = scanner.nextLine().trim();               // [4]
            if (title.length() >= 2) {                              // [5]
                return title;                                        // [6]
            }
            System.out.println("Title is too short. Try again.");
        }
    }
    public static void main(String[] args) {
        String book = "Book of " + Book.author() + ", " + Book.title();

        System.out.println(book);
    }
}