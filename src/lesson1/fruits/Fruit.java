package lesson1.fruits;

public abstract class Fruit {

    private Float weight;


    public Fruit(Float weight) {
        this.weight = weight;
    }

    public <T> Float getWeight() {
        return this.weight;
    }

}
