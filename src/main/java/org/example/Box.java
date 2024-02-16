package org.example;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Box<T extends Fruit> {
    private List<T> box;

    public Box(){
        box = new ArrayList<>();
    }

    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }

    public float getWeight(){
        if (box.isEmpty()) {
            return 0;
        }
        return box.get(0).getWeight() * box.size();
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public void transferToAnotherBox(Box<T> anotherBox) {
        if (this == anotherBox) {
            return;
        }
        for (int i = 0; i < box.size(); i++) {
            T fruit = box.get(i);
            anotherBox.addFruit(fruit, 1);
        }
        box.clear();
    }
}
