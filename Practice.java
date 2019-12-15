import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Practice {
    public static int[] histogram(int[] a, int M) {
        int[] str = new int[M];
        for (int i = 0; i < M; i++) {
            str[i] = 0;
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == a[j])
                    str[i]++;
            }
        }
        return str;
    }

    public static String exR1(int n) {
        if (n <= 0)
            return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 1, 4, 5, 3, 5, 6, 7, 3, 4, 2, 0, 3};
        int M = 8;
        int[] str = histogram(a, M);
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            count = count + str[i];
            StdOut.println(str[i]);
        }
        StdOut.println(count == a.length);
        StdOut.println(exR1(6));
    }
}
