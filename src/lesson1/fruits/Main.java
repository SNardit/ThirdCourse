package lesson1.fruits;

public class Main {
    public static void main(String[] args) {
        Orange orange = new Orange(1.5f);
        Apple apple = new Apple(1.2f);

        Box <Fruit> orangeBox = new Box<>(orange);
        Box <Fruit> orangeBox2 = new Box<>(orange);

        Box <Fruit> appleBox = new Box<>(apple);

        orangeBox.addToBox(10);
        orangeBox.addToBox(1);

        orangeBox2.addToBox(11);

        appleBox.addToBox(5);
        appleBox.addToBox(3);


        System.out.println(orangeBox.getBox() + " " + orangeBox.getBoxWeight(orange.getWeight()));
        System.out.println(orangeBox2.getBox() + " " + orangeBox2.getBoxWeight(orange.getWeight()));
        System.out.println(appleBox.getBox() + " " + appleBox.getBoxWeight(apple.getWeight()));

        System.out.println(orangeBox.compareWeightBox(appleBox));
        System.out.println(orangeBox.compareWeightBox(orangeBox2));

        orangeBox.shiftFruit(orangeBox, orangeBox2);
        orangeBox.shiftFruit(orangeBox2, orangeBox2);
        orangeBox.shiftFruit(orangeBox, appleBox);


        System.out.println(orangeBox.getBox());
        System.out.println(orangeBox2.getBox());
        System.out.println(appleBox.getBox());

    }
}
