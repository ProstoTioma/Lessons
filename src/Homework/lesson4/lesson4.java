package Homework.lesson4;

public class lesson4 {
    public static void main(String[] args) {
        System.out.println(concat("My ", "mother ", "the best"));
        System.out.println(findDivCount(1, 20, 3));
        System.out.println(compareSums(1, 100, 2, 20));
    }

    public static String concat(String a, String b, String c) {
        String res = a + b + c;
        return res;
    }

    public static int findDivCount(int a, int b, int n) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                count++;
            }
        }
        return count;
    }
    public static String compareSums(int a, int b, int c, int d) {
        int sum = 0;
        for(int i = a; i <= b; i++) {
            sum += i;
        }
        int sum1 = 0;
        for(int f = c; f <= d; f++) {
            sum1 += f;
        }
        String res = "true";
        String res1 = "false";
        return sum >= sum1 ? res : res1;
    }
}