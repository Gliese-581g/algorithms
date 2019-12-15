public class DoubleNode<Item extends Comparable> {
    private Node header;
    private Node trailer;
    private int N;

    private class Node<Item extends Comparable> {
        Node pre;
        Node succ;
        Item item;
    }

    public DoubleNode() {
        header.succ = trailer;
        trailer.pre = header;
    }

    public void pushHeader(Item item) {
        Node first = new Node();
        first.succ = header.succ;
        first.pre = header;
        header.succ.pre = first;
        header.succ = first;
        N++;
    }

    public Item popHeader() {
        header.succ = header.succ.succ;
        header.succ.succ.pre = header;
        Item item = (Item) header.succ.item;
        N--;
        return item;
    }

    public void pushTrailer(Item item) {
        Node last = new Node();
        last.pre = trailer.pre;
        last.succ = trailer;
        trailer.pre = last;
        N++;
    }

    public Item popTrailer() {
        trailer.pre = trailer.pre.pre;
        trailer.pre.pre.succ = trailer;
        Item item = (Item) trailer.pre.item;
        N--;
        return item;
    }

    public void insertBefore(Node curr, Node before) {
        before.pre = curr.pre;
        before.succ = curr;
        curr.pre.succ = before;
        curr.pre = before;
        N++;
    }

    public void insertAfter(Node curr, Node after) { //返回的是节点
        after.pre = curr;
        after.succ = curr.succ;
        curr.succ.pre = after;
        curr.succ = after;
        N++;
    }

    public Item delete(Node d) {
        d.pre.succ = d.succ;
        d.succ.pre = d.pre;
        N--;
        return (Item) d.item;
    }

    public Node search(Item e, Node p, int n) {
        while (0 <= n--) {
            if ((p = p.pre).item.compareTo(e) < 0) break;
        }
        return p;
    }
}
