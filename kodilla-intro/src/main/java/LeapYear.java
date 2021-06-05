public class LeapYear {
    public static void main(String[] args) {
        int rok = 2400 ;
        int a = 4;
        int b = 100;
        int c = 400;
        if (rok%a == 0 && rok%b > 0 || rok%c == 0)  {
            System.out.println("rok jest rokiem przestępnym");
        } else {System.out.println("rok nie jest rokiem przestępnym"); }
    }
}