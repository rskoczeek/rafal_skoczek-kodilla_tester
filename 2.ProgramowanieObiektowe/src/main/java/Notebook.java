public class Notebook {
    String weight;
    int price;
    int weight2;
    int year;

    public Notebook(String weight, int price, int weight2, int year) {
        this.weight = weight;
        this.price = price;
        this.weight2 = weight2;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }
        else if (this.price >= 600 && this.price < 1000) {
            System.out.println("The price is good.");
        }
        else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight2() {
        if (this.weight2 < 600) {
            System.out.println("This laptop is light");
        }
        else if (this.weight2 >= 600 && this.weight2 <= 1200) {
            System.out.println("This laptop is not very heavy");
        }
        else {
            System.out.println("This laptop is heavy");
        }
    }
    public void rekomendacja() {
        if (this.price < 2000 && this.year >= 2020) {
            System.out.println("To świetna okazja!!!");
        }
        else if (this.price < 1200 && this.year <= 2019 && this.year >=2015) {
            System.out.println("Przyzwoity sprzęt, w dobrej cenie");
        }
        else if (this.year < 2015) {
            System.out.println("Sprzęt starszej generacji");
        }

        else {
            System.out.println("Zapytaj eksperta.");
        }
    }

}
