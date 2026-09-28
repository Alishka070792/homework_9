import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    // Задача 1
    public static void task1() {
        System.out.println("Task 1");
        int[] inputArray1 = {100, 200, 300, 400, 500};
        float[] outputArray1 = new float[4];
        int sum = 0;
        int maxSum = inputArray1[0];
        int minSum = inputArray1[0];
        for (int sumFirst : inputArray1) {
            sum += sumFirst;
            if (sumFirst > maxSum) {
                maxSum = sumFirst;
            }
            if (sumFirst < minSum) {
                minSum = sumFirst;
            }
        }
        float averageSum = (float) sum / inputArray1.length;
        outputArray1[0] = sum;
        outputArray1[1] = maxSum;
        outputArray1[2] = minSum;
        outputArray1[3] = averageSum;
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));
        System.out.println();
    }

    // Задача 2
    public static void task2() {
        System.out.println("Task 2");
        int[] inputArray2 = {200, 300, 400, 500, 600};
        float[] outputArray2 = new float[inputArray2.length];
        int index = 0;
        for (int salary : inputArray2) {
            outputArray2[index] = ((float) salary / 100 * 13);
            index++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));
        System.out.println();
    }

    // Задача 3
    public static void task3() {
        System.out.println("Task 3");
        int [] inputArray3 = {1000, 2000, 3000, 4000, 5000};
        boolean [] outputArray3 = new boolean[inputArray3.length];
        int index = 0;
        for (int bonus : inputArray3) {
            outputArray3 [index] = bonus > 5000;
            index ++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));
        System.out.println();
    }

    // Задача 4
    public static void task4() {
        System.out.println("Task 4");
        int [] inputArray4 = {-100, 0, 100, 200, 300};
        boolean outputArray4 = true;
        for (int remain : inputArray4) {
            if (remain < 0) {
                outputArray4 = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(outputArray4);

    }

    // Задача 5
    public static void task5() {
        System.out.println("Task 5");

    }

}