package TheIterator.model.TheIteratorPat;

import TheIterator.model.entity.Flower;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
    private ArrayList list;
    private int current;

    public ArrayListIterator(ArrayList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        boolean flag = current < list.size();
        if (!flag) {
            current = 0;
        }
        return flag;
    }

    @Override
    public Flower next() {
        return (Flower) list.get(current++);
    }

    @Override
    public void reset() {
        current = 0;
    }
}
