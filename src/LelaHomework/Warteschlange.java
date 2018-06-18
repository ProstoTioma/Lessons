package LelaHomework;

public class Warteschlange {
    public static void main(String[] args) {

        int arr[] = {1, -2, 3, -4, 1234};

        for (int i = 0; i < arr.length; i++) {

            int maxIndex = findIndexOfMax(arr);

            if (maxIndex == Integer.MAX_VALUE) {
                System.out.println("Ende!");
                return;
            }
            else {
                int currentElement = arr[maxIndex];
                arr[maxIndex] = Integer.MIN_VALUE;
                System.out.println("Naechstgrosstes: " + currentElement);
            }


        }



    }

    public static int findIndexOfMax(int[] arr) {
        int max = 0;
        boolean isEmpty = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Integer.MIN_VALUE) {
                isEmpty = false;
            }

            if (arr[i] > arr[max]) {
                max = i;
            }
        }

        if (isEmpty) {
            max = Integer.MAX_VALUE;
        }
        return max;
    }
}
