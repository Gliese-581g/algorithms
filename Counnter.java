import org.w3c.dom.css.Counter;

public class Counnter {
    private final String name;
    private int count;

    public Counnter(String name) {
        this.name = name;
    }
    public void increment() {
        count++;
    }
    public int tally() {
        return count;
    }
    public String toString() {
        return count + " " + name;
    }
}
