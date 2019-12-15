import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Stack<Item> {
    private Node first;
    private int N;
    private class Node {
        Item item;
        Node next;
    }
    public boolean isEmpty() {
        return (first == null);
    }
    public int size() {
        return N;
    }
    public void push(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }
    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public static void main(String[] args) {
        Stack s = new Stack<String>();
        String[] a = {"you", "can", "see", "-", "me", "!"};
        for (int i = 0; i < a.length; i++) {
            String item = a[i];
                s.push(item);
            }
        while (!s.isEmpty()) {
            StdOut.print(s.pop() + " ");
        }
        StdOut.println("(" + s.size() + "left on stack)");
        }
}
