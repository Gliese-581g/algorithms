public class Queue<Item> {
    private Node first;
    private Node last;
    private int N;
    private class Node {
        Item item;
        Node next;
    }
    public boolean isEmpty() {
        return (N == 0);
    }
    public int size() {
        return N;
    }
    public void enqueue(Item item) {
        Node oldLast = last;
        last = new Node();
        last.item = item;
        if (isEmpty()) first = last;
        oldLast.next = last;
        N++;
    }
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
    }

}
