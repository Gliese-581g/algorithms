import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {
    public static int indexOf(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (a[lo] < key) {
                hi = mid;
            } else if (key < hi) {
                lo = mid + 1;
            } else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whilelist = in.readAllInts();
        Arrays.sort(whilelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (indexOf(key, whilelist) == -1) {
                StdOut.println(key);
            }
        }

    }
}