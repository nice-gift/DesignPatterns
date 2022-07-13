package TheIterator.model.TheIteratorPat;

import TheIterator.model.container.FixedArray;
import TheIterator.model.entity.Flower;

public class FixedArrayIterator implements Iterator {
    private FixedArray array;
    private int current = 0;

    public FixedArrayIterator(FixedArray array) {
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

    public void reset(){
        current=0;
    }
}
