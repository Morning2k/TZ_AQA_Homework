package Lesson_4.Cats_and_Plates;

import java.util.Scanner;

public class MainClass {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int action;
        Cat[] Сats = new Cat[2];
        Сats[0] = new Cat("Барсик", 15, false);
        Сats[1] = new Cat("Пушок", 40, false);


        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < Сats.length; i++) {
            if (Сats[i].fullness == false && Сats[i].appetite < plate.food) {
                Сats[i].eat(plate);
                Сats[i].fullness = true;
                System.out.println("Котик " + Сats[i].name + " покушал!");
            } else {
                System.out.println("Котик " + Сats[i].name + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько добавить еще еды добавить в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
    }
}