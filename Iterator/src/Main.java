import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        Iterator<Integer> iterator = fibonacciSequence.iterator();

        System.out.println("Ensimmäiset 10 Fibonaccin lukua:");
        for (int i = 0; i < 10; i++) {
            System.out.print(iterator.next() + " ");
        }
    }
}
