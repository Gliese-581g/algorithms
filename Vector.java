import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Vector {
    public static int[] uniquify(int[] a, int n) {
        int i = 0;
        int j = 0;
        while (++j < n) {
            if (a[i] != a[j]) {
                a[++i] = a[j];
            }
        }
        return resize(a, ++i);
    }

    public static int[] resize(int[] a, int N) {
        int[] b = new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = a[i];
        }
        return b;
    }

    public static void main(String[] args) {
//        for (int i = 0; i < n; i++) {
//            a[i] = StdRandom.uniform(0, 27);
//        }
        int[] a = {1, 2, 2, 3, 4, 4, 6, 6, 9, 10};
        int[] b = uniquify(a, a.length);
        for (int num : b
        ) {
            StdOut.println(num);
        }
    }
}
