import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int previous = 0; // Edellinen luku (n-2)
    private int current = 1;  // Nykyinen luku (n-1)

    @Override
    public boolean hasNext() {
        // Fibonaccin sekvenssi on ääretön, joten tämä palauttaa aina true.
        return true;
    }

    @Override
    public Integer next() {
        int nextValue = previous + current; // Laske seuraava luku
        previous = current;                 // Päivitä edellinen
        current = nextValue;                // Päivitä nykyinen
        return previous;                    // Palauta nykyinen Fibonaccin luku
    }
}
