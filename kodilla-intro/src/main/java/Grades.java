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


    public double getAverageGrade () {
        if (size == 0) {
            return 0;
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}

