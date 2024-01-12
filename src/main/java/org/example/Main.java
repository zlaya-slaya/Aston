package org.example;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(234,-235);
        printColor(101);
        compareNumbers(-100,-99);
    }

    //Метод №1
          public static void printThreeWords(){
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
    }

    //Метод №2
    public static void checkSumSign(int a, int b){
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else
            System.out.println("Сумма отрицательная");
    }

    //Метод №3
    public static void printColor(int value){
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } else
            System.out.println("Зеленый");
    }

    //Метод №4
    public static void compareNumbers(int a, int b){
       String result = (a >= b)? "a >= b" : "a < b";
       System.out.println(result);
    }
    }


