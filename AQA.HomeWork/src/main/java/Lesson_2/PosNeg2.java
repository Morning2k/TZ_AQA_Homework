package Lesson_2;

public class PosNeg2 {
    public static void main(String[] args) {
        PosNeg2.PositiveOrNegative(-11);
    }

    public static void PositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

}
