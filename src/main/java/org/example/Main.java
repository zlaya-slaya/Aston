package org.example;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        //Задание №1
        Random random = new Random();
        int[] array = random.ints(10, 1, 100).toArray();
        System.out.println(Arrays.toString(array));
        long count = Arrays.stream(array).filter(n -> n % 2 == 0).count();
        System.out.println("Количество чётных чисел: " + count);


        //Задание №2
        List<String> collect1 = new ArrayList<>();
        Collections.addAll(collect1, "Highload", "High", "Load", "Highload");
        long countHigh = collect1.stream()
                .filter(c -> c.equals("High"))
                .count();
        System.out.println("Слово '«High»' встречается в коллекции " + countHigh + " раз(а)");

        String first = collect1.isEmpty() ? "0" : collect1.get(0);
        System.out.println("Первый элемент коллекции:" + first);

        String last = collect1.isEmpty() ? "0" : collect1.get(collect1.size() - 1);
        System.out.println("Последний элемент коллекции: " + last);

        //Задание №3

        List<String> collect2 = new ArrayList<>();
        Collections.addAll(collect2, "f10", "f15", "f2", "f4", "f4");
        String[] array2 = collect2.stream()
                .sorted()
                .toArray(s -> new String[s]);
        System.out.println(Arrays.toString(array2));


        //Задание №5
        Scanner concole = new Scanner(System.in);
        ArrayList<String> logins = new ArrayList<>();
        while (true) {
            String login = concole.nextLine();
            if (login.isEmpty()) {
                break;
            }
            logins.add(login);
        }
        logins.stream()
                .filter(login -> login.startsWith("f"))
                .forEach(l -> System.out.println(l));
    }
}











