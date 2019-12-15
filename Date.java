import edu.princeton.cs.algs4.StdOut;

public class Date {
    private final int year;
    private final int month;
    private final int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return getMonth() + "/" + getDay() + "/" + getYear();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Date that = (Date) obj;
        if (this.day != that.day) return false;
        if (this.month != that.month) return false;
        if (this.year != that.year) return false;
        return true;
    }
    public static void main(String[] args) {
        Date now = new Date(2019, 11, 30);
        Date past = new Date(2019, 11, 29);
        int year = now.getYear();
        int month = now.getMonth();
        int day = now.getDay();

        StdOut.printf("%d, %d, %d\n",year, month, day);
        StdOut.println(now);
        StdOut.println(now.equals(past));
    }
}
