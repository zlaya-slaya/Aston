package org.example;

public class Cat extends Animal{

    private static int count = 0;
    public Cat(String name){
        super(name);
        count++;
    }

    public static int getCount(){
        System.out.println("Всего котов:" + count);
        return count;
    }

    public void running(int distance){
        if (distance > 0 && distance <= 200){
            System.out.println(name + " пробежал " + distance + "м");
        } else
           System.out.println(name + " не может пробежать " + distance + "м");
    }
    public void swimming(int distance){
        System.out.println("Коты не плавают");
    }

}
