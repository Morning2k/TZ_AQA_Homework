package Lesson_4.Cats_and_Plates;

public class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood(int x) {
        food += x;
    }

    public void info() {
        System.out.println("Всего еды: " + food);
    }
}
