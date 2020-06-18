package lesson1.fruits;

import java.util.ArrayList;


public class Box <T extends Fruit> {
    private  T obj;
    private ArrayList<Integer> box;

    public Box(T obj) {
        this.obj = obj;
        this.box = new ArrayList<>();
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public ArrayList<Integer> getBox() {
        return box;
    }

    public void addToBox(int quantity) {
        box.add(quantity);
    }

    public Float getBoxWeight(Float weight) {
        return countQuantity()*weight;
    }

    public int countQuantity() {
        int quantity = 0;
        for (int i = 0; i < box.size() ; i++) {
            quantity += box.get(i);
        }
        return quantity;
    }

    public boolean compareWeightBox (Box<T> another) {
        return Math.abs(this.getBoxWeight(obj.getWeight()) -  another.getBoxWeight(obj.getWeight())) < 0.0001;
    }

    public ArrayList<Integer> shiftFruit (Box<T> from, Box<T> to) {
        if (!from.equals(to) && from.obj == to.obj) {
            for (int i = 0; i < from.getBox().size() ; i++) {
                to.getBox().add(from.getBox().get(i));
        }
            from.getBox().clear();
            System.out.println("Фрукты были пересыпаны из одного ящика в другой");
        }
        else if (from.obj != to.obj) {System.out.println("Нельзя смешивать разные виды фруктов!");}
        else System.out.println("Вы пытаетесь пересыпать фрукты из ящика в этот же ящик, пустая трата времени!");
        return to.getBox();
    }

}
