import TheIterator.model.TheIteratorPat.Iterator;
import TheIterator.model.entity.Flower;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add(new Flower("White Rose"));
        hashSet.add(new Flower("White Rose"));
        hashSet.add(new Flower("White Rose"));

        Iterator iterator = new HashSetIterator(hashSet);

        view(iterator);
//        iterator.reset();
    }

    public static void view(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
