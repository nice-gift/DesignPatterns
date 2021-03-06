package TheIterator.model.entity;

import TheIterator.model.container.Container;
import TheIterator.model.container.DynamicArray;

public class Bouquet {
    private Container flowers;

    public Bouquet() {
        flowers = new DynamicArray();
    }

    public Bouquet(Flower[] flowers) {
        this();
        if (flowers != null) {
            for (int i = 0; i < flowers.length; i++) {
                this.flowers.add(flowers[i]);
            }
        } else {
            flowers = new Flower[0];
        }
    }

    public Bouquet(Container flowers) {
        this.flowers = flowers;
    }

    public int size() {
        return flowers.size();
    }

    public Flower get(int index) {
        if (index >= 0 && index < flowers.size()) {
            return flowers.get(index);
        }
        return null;
    }

    public void add(Flower flower) {
        flowers.add(flower);
    }

    public void remove(int index) {
        flowers.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("List of flowers: ");
        for (int i = 0; i < flowers.size(); i++) {
            stringBuilder.append("\n").append(flowers.get(i));
        }
        return stringBuilder + "";
    }
}