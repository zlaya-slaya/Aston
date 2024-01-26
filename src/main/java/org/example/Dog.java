package org.example;

public class Dog extends Animal{
    private static int count = 0;

    public Dog(String name){
        super(name);
        count++;
    }

    public static int getCount(){
        System.out.println("Всего собак:" + count);
        return count;
    }
    public void running(int distance) {
        if (distance > 0 && distance <= 500) {
            System.out.println(name + " пробежал " + distance + "м");
        } else {
            System.out.println(name + " не может пробежать " + distance + "м");
        }
    }

   public void swimming(int distance){
    if (distance > 0 && distance <= 10){
        System.out.println(name + " проплыл " + distance + "м");
    } else
        System.out.println(name + " не может проплыть " + distance + "м");
    }

}