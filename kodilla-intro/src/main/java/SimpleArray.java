public class SimpleArray {
        public static void main(String[] args) {

            String[] lektury = new String [5];
            lektury[0] = "Doktor Faustus";
            lektury [1] = "Morfina";
            lektury [2] = "Opowieści z Meekhańskiego pogranicza";
            lektury [3] = "Pięć procent z niczego";
            lektury [4] = "Harry Potter";

            String lektura = lektury [2];

            System.out.println(lektura);

            int numberOfElements = lektury.length;

            System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");

        }
}