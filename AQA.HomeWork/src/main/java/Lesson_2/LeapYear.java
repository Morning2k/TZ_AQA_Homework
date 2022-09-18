package Lesson_2;

public class LeapYear {
    public static void main(String[] args) {
        LeapYear.leapYear(2004);
    }

    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}