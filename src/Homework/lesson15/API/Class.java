package Homework.lesson15.API;

public class Class {
    public int method() {
        int index = 0;
        int[] array = new int[100];

        for(int el : array) {
            array[index] = array[el];
            index++;
        }
        return array[index];
    }
}
