package Lesson_4.Cats_and_Plates;

public class Cat {
    String name;
    int appetite;
    boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}
