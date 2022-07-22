import TheIterator.model.TheIteratorPat.Iterator;
import TheIterator.model.entity.Flower;

import java.util.HashSet;

public class HashSetIterator implements Iterator {
    private HashSet hashSet;
    private int current = 0;

    public HashSetIterator(HashSet hashSet) {
        this.hashSet = hashSet;
    }

    @Override
    public Flower next() {
        java.util.Iterator iterator = hashSet.iterator();
        Flower flower = null;
        int iter = 0;

        while (iterator.hasNext()) {
            if (current == iter)
            {
                flower = (Flower)iterator.next();
                break;
            }
            iter++;
        }
        current++;
        return flower;
    }

    @Override
    public boolean hasNext() {
        boolean flag = current < hashSet.size();
        if (!flag) {
            reset();
        }
        return flag;
    }

    @Override
    public void reset() {
        current = 0;
    }
}