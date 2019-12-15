import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class DrawRandom {
    public static void main(String[] args) {
        int N = 30;
        double[] count = new double[N];
        for (int i = 0; i < N; i++) {
            count[i] = StdRandom.uniform();
        };
        Arrays.sort(count);
        for (int i = 0; i < N; i++) {
            double x = 1.0*i/N;
            double y = count[i]/2.0;
            double rw = 0.5/N;
            double rh = y;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}
