public class Grades {

    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int getLastGrade() {
        if (size == 0) {
            return 0;
        }
        return this.grades[this.size - 1];
    }

        double sum = 0;
        for (int suma: grades) {

            sum += suma;
        }
    public double getAverageGrade () {
        if (size == 0) {
            return 0;
        }
        return sum / grades.length;
    }
}
