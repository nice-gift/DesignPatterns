package TheIterator.controller;

import TheIterator.model.TheIteratorPat.ArrayListIterator;
import TheIterator.model.TheIteratorPat.DynamicArrayIterator;
import TheIterator.model.TheIteratorPat.FixedArrayIterator;
import TheIterator.model.TheIteratorPat.Iterator;
import TheIterator.model.container.DynamicArray;
import TheIterator.model.container.FixedArray;
import TheIterator.model.entity.Flower;

import java.util.ArrayList;

public class Mainnnnn {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(new Flower("Rose"));
        array.add(new Flower("Chamomile"));
        array.add(new Flower("Rose"));

        DynamicArrayIterator iterator = new DynamicArrayIterator(array);

        ArrayList list = new ArrayList<>();
        list.add(new Flower("Rose"));
        list.add(new Flower("Rose"));
        list.add(new Flower("Chamomile"));
        list.add(new Flower("Rose"));

        ArrayListIterator arrayListIterator = new ArrayListIterator(list);

        view(arrayListIterator);


//        FixedArray array = new FixedArray();
//        array.add(new Flower("Rose"));
//        array.add(new Flower("Tulip"));
//        array.add(new Flower("Chamomile"));
//
//        FixedArrayIterator iterator = new FixedArrayIterator(array);
//
//        view(iterator);
//        view(iterator);
    }

    public static void view(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
