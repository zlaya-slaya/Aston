package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      checkSum(12, 8);
      checkSignPrint(-10);
      checkSignIsPositive(23);
      printString("Сколько можно?", 5);
      checkYear(2008);
      getArray(7,88);

    }

    public static boolean checkSum(int a, int b){
        int sum = a + b;
        boolean result = (sum >= 10 && sum <=20);
        System.out.println(result);
        return result;
    }

    public static void checkSignPrint(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        } else
            System.out.println("Число отрицательное");
    }

    public static boolean checkSignIsPositive(int a){
        boolean result = (a <= 0);
        System.out.println(result);
        return result;
    }

    public static void printString(String s, int a){
       for  (int i = 0; i < a; i++) {
           System.out.println(s);
       }
    }

    public static boolean checkYear(int a){
        boolean result = (a % 4 == 0 && a % 100 !=0 || a % 400 == 0);
        System.out.println(result);
        return result;
    }

    public static int [] getArray(int len, int initialValue){
        int[] array = new int [len];
        for (int i = 0; i < array.length; i++){
            array[i] = initialValue;
        }
        System.out.print(Arrays.toString(array));
        return array;

    }
}








