import edu.princeton.cs.algs4.StdOut;

public class InsertionSort {
    public static int[] sort(int[] a) {
        for(int j = 1; j < a.length; j++) {
            int i = j - 1;
            int key = a[j];
            while (i >= 0 && a[i] > key) {
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = key;
        }
        return a;
    }
    public static boolean less(int a, int b) {
        return a < b;
    }
    public static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++) {
            if (i > mid)  a[j++] = aux[k];
            else if (i > hi) a[i++] = aux[k];
            else if (less(a[j], a[i])) a[j++] = aux[k];
            else a[i++] = aux[k];
        }

    }
    public static void MergeSort(int[] a, int[] aux, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        MergeSort(a, aux, lo, mid);
        MergeSort(a, aux,mid+1, hi);
        merge(a, aux, lo, mid, hi);
    }
    public static void  main(String[] args) {
//    a = sort(a);
    int[] a = {4, 5, 2, 7, 1, 9, 3};
    int[] aux = new int[a.length];
        MergeSort(a, aux,0, a.length-1);
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }

}
