package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee empl1 = new Employee("Michael Scott", "regional manager", "exemple@gmail.ru", "5568909888", 44, 200000);
        empl1.getInfoEmployee();

        Employee[] empArray = new Employee[5];
        empArray[0] = empl1;
        empArray[1] = new Employee("Dwight Schrute,", "assistant to the regional manager", "schrute@gmail.ru", "89156789034", 40, 150000);
        empArray[2] = new Employee("Jim Halpert", "salesman", "jim@gmail.ru", "89687359923", 32, 88000);
        empArray[3] = new Employee("Toby Flenderson", "hr", "toby@gmail.ru", "89167774809", 42, 70666);
        empArray[4] = new Employee("Pam Beesly", "receptionist", "beesly@gmail.ru", "89257780932", 28, 52500);

        for (int i = 0; i < empArray.length; i++){
            empArray[i].getInfoEmployee();
        }


        Park park1 = new Park("Kidzaния", "г.Москва, ТЦ 'АвиаПарк'", "ежедневно с 12:00 до 23:00");
        park1.getParkInfo();

        Park.Attraction attraction1 = park1. new Attraction("Парижская карусель", "с 12:00 до 22:00", 250);
        attraction1.getAttractionInfo();


    }
}

