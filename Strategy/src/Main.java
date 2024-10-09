
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ContextSort ContextSort = new ContextSort();

        // The two datasets
        int[] smallData = generateRandomArray(30);
        int[] largeData = generateRandomArray(100000);

        // Bubble Sort
        ContextSort.setStrategy(new BubbleSort());
        measurePerformance(ContextSort, smallData, "BubbleSort - Small Dataset");
        measurePerformance(ContextSort, largeData, "BubbleSort - Large Dataset");

        //Quick Sort
        ContextSort.setStrategy(new QuickSort());
        measurePerformance(ContextSort, smallData, "QuickSort - Small Dataset");
        measurePerformance(ContextSort, largeData, "QuickSort - Large Dataset");

        //Selection Sort
        ContextSort.setStrategy(new SelectionSort());
        measurePerformance(ContextSort, smallData, "SelectionSort - Small Dataset");
        measurePerformance(ContextSort, largeData, "SelectionSort - Large Dataset");
    }

    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(100000);
        }
        return array;
    }

    private static void measurePerformance(ContextSort ContextSort, int[] array, String label) {
        int[] copy = array.clone();
        long startTime = System.nanoTime();
        ContextSort.sort(copy);
        long endTime = System.nanoTime();
        System.out.println(label + ": " + (endTime - startTime) + " ns");
    }
}