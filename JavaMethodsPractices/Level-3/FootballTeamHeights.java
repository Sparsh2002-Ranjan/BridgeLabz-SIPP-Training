import java.util.Random;
public class FootballTeamHeights {

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }
        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        System.out.println("Player Heights:");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }
        System.out.println("\nShortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.println("Mean Height: " + mean + " cm");
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int height : array) {
            sum += height;
        }
        return sum;
    }

    public static double calculateMean(int sum, int numberOfElements) {
        return (double) sum / numberOfElements;
    }

    public static int findShortest(int[] array) {
        int min = array[0];
        for (int height : array) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    public static int findTallest(int[] array) {
        int max = array[0];
        for (int height : array) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}
