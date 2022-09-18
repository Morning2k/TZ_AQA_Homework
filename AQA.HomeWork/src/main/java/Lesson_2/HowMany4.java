package Lesson_2;

public class HowMany4 {
    public static void main(String[] args) {
        HowMany4.printWordNTimes("Tim", 5);
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("[" + i + "]" + " " + word);
        }
    }
}