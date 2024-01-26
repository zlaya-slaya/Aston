package org.example;

public class Bowl {
    int food;

    public Bowl(int food){
        this.food = food;
    }

    public int getFood() {
        System.out.println("В миске " + food + " еды.");
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int addFood(int supplement){
        food += supplement;
        return food;
    }
}
