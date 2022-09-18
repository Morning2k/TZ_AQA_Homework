package Lesson_2;

public class TwoArguments9 {
    public static void main(String[] args) {
        printArrayInConsole(retLenArr(5, 3));
    }

    public static int[] retLenArr(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static void printArrayInConsole(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }
}