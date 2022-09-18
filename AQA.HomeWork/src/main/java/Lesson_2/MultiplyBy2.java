package Lesson_2;

public class MultiplyBy2 {
    public static void main(String[] args) {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        arrayMultiply(arr2);

    }

    public static void arrayMultiply(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i] + "");
        }
    }
}