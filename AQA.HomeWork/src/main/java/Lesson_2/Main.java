package Lesson_2;

public class Main {
    public static void main(String[] args) {
        Main.within10and20(51,10);
    }

    public static boolean within10and20 (int a, int b){
        if (a + b >= 10 && a + b <= 20) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }

}