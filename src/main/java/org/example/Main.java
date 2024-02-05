package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Задание №1

       String[] array = {"Hello", "Rose", "Java", "Monday", "Loop", "Deal", "Java", "Phone",
               "Jake", "Finn", "Deal", "Hello", "Loop", "Java", "Finn", "Hello", "Monday", "Loop",
               "Monday", "Java", "Red", "Room", "Rose", "Jake", "Hello", "Red", "Java", "Hello"};

       Set<String> unique = new HashSet<>(Arrays.asList(array));
       System.out.println(unique);

       Map<String, Integer> count = new HashMap<>();
       for (int i = 0; i < array.length; i++) {
            String word = array[i];
            if (count.containsKey(word)) {
                count.put(word, count.get(word) + 1);
            } else {
                count.put(word, 1);
            }
        }
        System.out.println(count);

        //Задание №2

       PhoneBook book = new PhoneBook();

       book.add("Иванов", "89167835465");
       book.add("Петров", "89134567825");
       book.add("Сидоров", "89173542899");
       book.add("Иванов", "89143678800");
       System.out.println(book.get("Сидоров"));
       System.out.print(book.get("Иванов"));
    }
}





