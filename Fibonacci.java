import edu.princeton.cs.algs4.StdOut;

public class Fibonacci {
    private static int foo(int num) {
        if (num == 1 || num == 2) return 1;
        return foo(num - 2) + foo(num - 1);
    }
    private static long quickFoo(int n) {
        if (n <=0) {
            return n;
        }
        long[] memo = new long[n+1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }
        for (int i = 1; i <= n; i++) {
            if (i <= 2) memo[i] = 1;
            else memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
//        return fib(n, memo);
    }

    private static long fib(int n, long[] memo) {
        if (memo[n] != -1) {
            return memo[n];
        } else if (n <= 2) {
            memo[n] = 1;
        } else {
            memo[n] = fib(n-1, memo) + fib(n-2, memo);
        }
        return memo[n];
    }

    public static void main(String[] args) {

        for (int i = 1; i < 64; i++) {
//            int value = foo(i);
                long value = quickFoo(i);
            StdOut.printf("%d\n", value);
        }
    }
}
