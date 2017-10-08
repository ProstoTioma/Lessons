package Homework.lesson8;

public class Arithmetic {
    public boolean check(int[] array) {

        if(max(array) + min(array) > 100) {
            return true;
        } else return false;
    }
    public long max(int[] a) {
        long max = 0;
        for(long element : a ) {
            if(element > max) {
                max = element;
            }
        }
        return max;
    }

    public int min(int[] a) {
        int min = 0;
        for(int element : a ) {
            if(element < min) {
                min = element;
            }
        }
        return min;
    }


}
