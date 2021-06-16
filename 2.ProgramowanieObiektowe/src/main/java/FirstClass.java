public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600g", 1200, 600, 2021);
            System.out.println(notebook.weight);
            System.out.println(notebook.price + " PLN");
        notebook.checkPrice();
        notebook.checkWeight2();
        notebook.rekomendacja();

            System.out.println(" ");

        Notebook heavyNotebook = new Notebook("2000g", 1199, 2000, 2019);
            System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " PLN");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight2();
        heavyNotebook.rekomendacja();

            System.out.println(" ");

        Notebook oldNotebook = new Notebook("1200g", 5900, 1200, 2000);
            System.out.println(oldNotebook.weight + "\n" + oldNotebook.price + " PLN");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight2();
        oldNotebook.rekomendacja();

            System.out.println(" ");

        Notebook expensiveNotebook = new Notebook("1200", 4999, 1200, 2019);
        expensiveNotebook.checkPrice();
        expensiveNotebook.checkWeight2();
        expensiveNotebook.rekomendacja();
    }
}
