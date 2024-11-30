import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = null;
        double count = 0.0;

        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            count++;
            double p = 1/count;
            if (StdRandom.bernoulli(p)) {
                champion = word;
            }
        }
        StdOut.println(champion);
    }
}
