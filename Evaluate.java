import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            switch (s) {
                case "+": ops.push(s);
                case "-": ops.push(s);
                case "*": ops.push(s);
                case "/": ops.push(s);
                case "sqrt": ops.push(s);
                case ")": {
                    String op = ops.pop();
                    double val = vals.pop();
                    switch (op) {
                        case "+": val = vals.pop() + val;
                        case "-": val = vals.pop() - val;
                        case "*": val = vals.pop() * val;
                        case "/": val = vals.pop() / val;
                        case "sqrt": val = Math.sqrt(val);
                    };
                    vals.push(val);
                }
                default: vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }
}
