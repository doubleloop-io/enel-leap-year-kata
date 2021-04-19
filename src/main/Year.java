public class Year {
    private final int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isDivisibleBy(int divisor) {
        return year % divisor == 0;
    }

    public boolean isLeap() {
        if (isDivisibleBy(400)) return true;
        if (isDivisibleBy(100)) return false;
        if (isDivisibleBy(4)) return true;
        return false;
    }
}
