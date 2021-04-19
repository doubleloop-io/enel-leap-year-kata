public class Year {
    public int year;

    public Year(int year) {
        this.year = year;
    }

    public boolean isDivisibleBy(int year, int divisor) {
        return year % divisor == 0;
    }
}
