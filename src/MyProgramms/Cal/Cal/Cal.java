package MyProgramms.Cal.Cal;

public class Cal {
    public static void main(String[] args) {
        System.out.println();
    }
    public long kalkulatorumnozenie2(long a, long b) {
        return a * b;
    }
    public long kalkulatorumnozenie3(long a, long b, long c) {
        return a * b * c;
    }
    public long Kalkulator10(long a) {
        for(long i = 1; i < 11; i++) {
            System.out.println(a * i);
        }
        return a;
    }
    public double kalkulatordelenie(double a, double b) {
        return  a / b;
    }
    public long kalkulatordobawlenie(long a, long b) {
        return a + b;
    }
    public long kalkulatorotnimanie(long a, long b) {
        return a - b;
    }
}
