public class UserApp {

    public static void main(String[] args) {

        User bartek = new User("Bartek", 24);
        User zofia = new User("Zofia", 15);
        User kasia = new User("Kasia", 19);
        User piotr = new User("Piotr", 44);
        User zbyszek = new User("Zbyszek", 25);
        User[] users = {bartek, zofia, kasia, piotr, zbyszek};

        printUsersUnderAverage(users);

    }


    public static double getAvarageAge(User[] users) {
        double result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].getAge();
        }
        return result / users.length;
    }

    public static void printUsersUnderAverage(User[] users) {
        double averageAge = getAvarageAge(users);
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < averageAge) {
                System.out.println(users[i].getName());
            }
        }
    }

}







