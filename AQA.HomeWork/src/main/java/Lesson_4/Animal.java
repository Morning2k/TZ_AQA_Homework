package Lesson_4;

public class Animal {
    public static void main(String[] args) {
        Cat cat = new Cat("Пушок");
        Dog dog = new Dog("Шарик");

        dog.run(400);
        dog.swim(3);

        cat.run(1000);
        cat.swim(10);
    }

    public static class Animals { //super class
        String name;
        String type;
        int maxRun;
        int maxSwim;

        public Animals(String name) {
            this.name = name;
        }

        public void run(int dist) {
            if (this.maxRun >= dist) System.out.println(this.type + " " + this.name + " run " + dist + " m.");
            else System.out.println(this.type + " " + this.name + " can't run so far.");
        }

        public void swim(int dist) {
            if (this.maxSwim >= dist) System.out.println(this.type + " " + this.name + " swim " + dist + " m.");
            else System.out.println(this.type + " " + this.name + " can't swim so far.");
        }
    }

    public static class Cat extends Animals { // наследующий класс

        public Cat(String name) {
            super(name);
            this.maxRun = 200;
            this.type = "Cat";
        }

        @Override
        public void swim(int dist) {
            System.out.println("Cats do not swim!");
        }
    }

    public static class Dog extends Animals { // наследующий класс

        public Dog(String name) {
            super(name);
            this.type = "Dog";
            this.maxRun = 500;
            this.maxSwim = 10;
        }
    }
}