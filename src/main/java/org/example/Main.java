package org.example;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //Коробка с яблоками
        Box<Apple> box1 = new Box<>();
        box1.addFruit(new Apple(), 10);

        //Коробка с апельсинами
        Box<Orange> box2 = new Box<>();
        box2.addFruit(new Orange(), 15);


        System.out.println("Вес коробки с яблоками: " + box1.getWeight());
        System.out.println("Вес коробки с апельсинами: " + box2.getWeight());
        System.out.println("Вес коробок одинаковый? " + box1.compare(box2));

        //Перемещение фруктов из одной коробки в другую
        Box<Apple> box3 = new Box<>();
        box3.addFruit(new Apple(), 7);

        box3.transferToAnotherBox(box1);
        System.out.println("Вес наполненной коробки с яблоками: " + box1.getWeight());
        System.out.println("Вес опустошенной коробки: " + box3.getWeight());

    }
}











