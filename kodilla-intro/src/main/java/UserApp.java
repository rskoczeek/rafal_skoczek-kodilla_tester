public class UserApp {

    public static void main(String[] args) {

        User bartek = new User("Bartek", 24);
<<<<<<< HEAD
        User zofia = new User("Zofia", 15);
        User kasia = new User("Kasia", 19);
        User piotr = new User("Piotr", 44);
        User zbyszek = new User("Zbyszek", 25);
        User[] users = {bartek, zofia, kasia, piotr, zbyszek};

        printUsersUnderAverage(users);

=======
        User zofia = new User("Zofia", 35);
        User kasia = new User("Kasia", 19);
        User piotr = new User("Piotr", 44);
        User zbyszek = new User("Zbyszek", 55);
        User[] users = {bartek, zofia, kasia, piotr, zbyszek};

        System.out.println(getAvarageAge(users));
        System.out.println(getUsersUnderAvarage(users));
>>>>>>> 492bd141d4c37cc42e0f01f740dac3dd4018accf
    }


    public static double getAvarageAge(User[] users) {
        double result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].getAge();
        }
        return result / users.length;
    }
<<<<<<< HEAD

    public static void printUsersUnderAverage(User[] users) {
        double averageAge = getAvarageAge(users);
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < averageAge) {
                System.out.println(users[i].getName());
=======
    public static String getUsersUnderAvarage(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (getAvarageAge() > users[i].getAge(users)) {
            return users[i].getName();
>>>>>>> 492bd141d4c37cc42e0f01f740dac3dd4018accf
            }
        }
    }

}







<<<<<<< HEAD
=======

>>>>>>> 492bd141d4c37cc42e0f01f740dac3dd4018accf
