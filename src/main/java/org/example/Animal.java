package org.example;

public class Animal {
    String name;
    int distance;
    boolean wellFed;
    private static int count = 0;

    public Animal(String name){
        this.name = name;
        count++;
    }

    public String getName() {
       return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount(){
        System.out.println("Всего животных:" + count);
        return count;
    }

    public boolean getWellFed(){
        if (wellFed == true){
            System.out.println(name + " сыт.");
        } else
         System.out.println(name + " голоден.");
         return wellFed;
    }

    public void running(int distance){
       System.out.println(name + " пробежал " + distance + " м" );
    }

    public void swimming (int distance){
    System.out.println(name + " проплыл " + distance + " м" );
    }

    public boolean eatFood(Bowl bowl, int portion){
        if ((wellFed == false) && (bowl.food >= portion)){
            wellFed = true;
            bowl.food -= portion;
        } else
            System.out.println("Недостаточно корма. Добавьте еды питомцу.");
        return wellFed;

    }

}
