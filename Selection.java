import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Selection {
    public static void sort(int[] a) {
        boolean sorted = false;
        for (int hi = a.length; !sorted; hi--) {
            sorted = true;
            for (int lo = 1; lo < hi; lo++) {
                if ((a[lo] < a[lo - 1])) {
                    exch(a, lo, lo-1);
                    sorted = false;
                }
            }
        }
    }


    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(int[] a, int i, int j) {
        int v = a[i];
        a[i] = a[j];
        a[j] = v;
    }

    private static void show(int[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }

    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int N = 20;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(0, 20);
            StdOut.print(a[i] + " ");
        }
//        int[] a = {1, 7, 3, 2, 4};
        StdOut.println();
        sort(a);
        isSorted(a);
        show(a);
    }
}
