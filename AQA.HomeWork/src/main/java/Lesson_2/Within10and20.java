package Lesson_2;

public class Within10and20 {
    public static void main(String[] args) {
        Within10and20.within10and20(10, 10);
    }

    public static boolean within10and20(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

}