import java.util.Random;
class RandomNumbers {
    private static final Random RANDOM = new Random();
    private static final int MAX_BOUNDARY = 31;

    private int min = Integer.MAX_VALUE;
    private int max = Integer.MAX_VALUE;

    public void draw()
        int sum = 0;
        int actual;
        while (sum < 5000) {
            actual = RANDOM.nextInt(MAX_BOUNDARY);
            if (actual < min) {
                min = actual;
            }
            if (actual > max) {
                max = actual;
            }
            sum = sum + actual;
        }
    }
    public int max() {
        return max;
    }
    public int min() {
        return min;
    }
    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.draw();
        System.out.println("Min - " + randomNumbers.min());
        System.out.println("Max - " + randomNumbers.max());
    }


}
