package org.example;

public class Main{
    public static void main(String[] args) {
       //Задание №1

        Cat cat1 = new Cat("Том");
        cat1.running(20);
        cat1.swimming(10);

        Dog dog1 = new Dog("Пёсель");
        dog1.running(499);
        dog1.swimming(11);


        Bowl bowl1 = new Bowl(55);

        Cat[] arrayCat = {new Cat("Первый"),
                new Cat("Второй"),
                new Cat("Третий"),
                new Cat("Четверный"),
                new Cat("Пятый"),
                new Cat("Шестой")};
        for (int i = 0; i < arrayCat.length; i++ ){
            arrayCat[i].eatFood(bowl1, 11);
        }
        for (int i = 0; i < arrayCat.length; i++){
            arrayCat[i].getWellFed();
        }


        bowl1.addFood(30);
        bowl1.getFood();


        Cat.getCount();
        Dog.getCount();
        Animal.getCount();


    //Задание №2

        Rectangle r1 = new Rectangle(4, 5, "Черный", "Белый");
        r1.getAllInfo();

        Triangle t1 = new Triangle(3, 4, 5, "Розовый", "Салатовый");
        t1.getAllInfo();

        Circle c1 = new Circle(5, "Голубой", "Синий");
        c1.getAllInfo();
    }
}

