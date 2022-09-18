package Lesson_2;

public class PosNegBoolean3 {
    public static void main(String[] args) {
        PosNegBoolean3.positiveOrNegative(-1);
    }

    public static boolean positiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
}
