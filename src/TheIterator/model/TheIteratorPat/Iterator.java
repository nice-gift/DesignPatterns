package TheIterator.model.TheIteratorPat;

import TheIterator.model.entity.Flower;

public interface Iterator {
    boolean hasNext();
    Flower next();
    void reset();
}
