public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook("600g", 400);
        System.out.println(notebook.weight);
        System.out.println(notebook.price);
        if (notebook.price > 900) {
            System.out.println("This notebook is quite expensive");
        }
        else {
            System.out.println("This notebook is cheap.");
        }

        Notebook heavyNotebook = new Notebook("2000g", 950);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();

        Notebook oldNotebook = new Notebook("1200g", 250);
        System.out.println(oldNotebook.weight + "\n" + notebook.price);
        oldNotebook.checkPrice();
    }
}
