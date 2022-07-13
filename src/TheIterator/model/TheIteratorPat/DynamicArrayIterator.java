package TheIterator.model.TheIteratorPat;

import TheIterator.model.container.DynamicArray;
import TheIterator.model.entity.Flower;

public class DynamicArrayIterator implements Iterator {
    private DynamicArray array;
    private int current = 0;

    public DynamicArrayIterator(DynamicArray array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        boolean flag = current < array.size();
        if (!flag) {
            current=0;
        }
        return flag;
    }

    @Override
    public Flower next() {
        return array.get(current++);
    }

    @Override
    public void reset() {
        current = 0;
    }
}
