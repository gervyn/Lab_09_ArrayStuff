import java.util.Random;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {

        // ===== Task 1 =====
        int[] dataPoints = new int[100];

        // ===== Task 2 =====
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // ===== Task 3 =====
        System.out.println("Task 3 — dataPoints values (100 ints, 1–100):");
        for (int i = 0; i < dataPoints.length; i++) {
            if (i > 0) System.out.print(" | ");
            System.out.print(dataPoints[i]);
        }
        System.out.println();
        System.out.println();

        // ===== Task 4 =====
        long sum = 0;
        for (int v : dataPoints) {
            sum += v;
        }
        double avg = sum / (double) dataPoints.length;
        System.out.printf("Task 4 — Sum of dataPoints is: %d%n", sum);
        System.out.printf("Task 4 — Average of dataPoints is: %.2f%n%n", avg);

        // ===== Task 5 =====
        int searchVal = SafeInput.getRangedInt("Task 5 — Enter a value to COUNT (1–100): ", 1, 100);

        // ===== Task 6 =====
        int count = 0;
        for (int v : dataPoints) {
            if (v == searchVal) count++;
        }
        System.out.printf("Task 6 — The value %d was found %d time(s) in dataPoints.%n%n", searchVal, count);

        // ===== Task 7 =====
        int firstVal = SafeInput.getRangedInt("Task 7 — Enter a value to FIND FIRST INDEX (1–100): ", 1, 100);
        int firstPos = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == firstVal) {
                firstPos = i;
                break;
            }
        }
        if (firstPos >= 0) {
            System.out.printf("Task 7 — The value %d was found at array index %d.%n%n", firstVal, firstPos);
        } else {
            System.out.printf("Task 7 — The value %d was NOT found in the array.%n%n", firstVal);
        }

        // ===== Task 8 =====
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) min = dataPoints[i];
            if (dataPoints[i] > max) max = dataPoints[i];
        }
        System.out.printf("Task 8 — Minimum value in dataPoints: %d%n", min);
        System.out.printf("Task 8 — Maximum value in dataPoints: %d%n%n", max);

        // ===== Task 9 (method call) =====
        System.out.println("Task 9 — Using getAverage(dataPoints):");
        System.out.printf("Average of dataPoints is: %.2f%n", getAverage(dataPoints));
    }

    // ===== Task 9 (actual method, OUTSIDE main) =====
    public static double getAverage(int values[]) {
        if (values == null || values.length == 0) {
            return Double.NaN;
        }
        long sum = 0;
        for (int v : values) {
            sum += v;
        }
        return sum / (double) values.length;
    }

}