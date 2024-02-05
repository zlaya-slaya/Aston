package org.example;
import java.util.*;

public class PhoneBook{
    private Map<String, List<String>> book;

    public PhoneBook(){
        book = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        List<String> number = book.get(lastName);
        if (number == null) {
            number = new ArrayList<>();
            book.put(lastName, number);
        }
        number.add(phoneNumber);
    }

    public List<String> get(String lastName) {
        System.out.println("Номера телефонов для фамилии " + lastName + ":");
        return book.get(lastName);
    }

}