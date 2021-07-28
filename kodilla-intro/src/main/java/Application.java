public class Application {
    String name;
    double age;
    double height;

    public User (String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    User adam = new User("Adam", 34, 188);

    public static void showUser () {
        if (User.name() != null) {
            if (User.age() > 30 && User.height() > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}