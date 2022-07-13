//package TheIterator.controller;
//
//import by.kursy.luschik.javalessons.lesson23.ooptask.model.TheIteratorPattern.DynamicArrayIterator;
//import by.kursy.luschik.javalessons.lesson23.ooptask.model.TheIteratorPattern.Iterator;
//import by.kursy.luschik.javalessons.lesson23.ooptask.model.container.DynamicArray;
//import by.kursy.luschik.javalessons.lesson23.ooptask.model.entity.Flower;
//
//public class ControllerForIterator {
//    public static void main(String[] args) {
//        DynamicArray array = new DynamicArray();
//        array.add(new Flower());
//        array.add(new Flower());
//        array.add(new Flower());
//        array.add(new Flower());
//        DynamicArrayIterator iterator = new DynamicArrayIterator(array);
//
//        view(iterator);
//        iterator.reset();
//        view(iterator);
//    }
//
//    public static void view(Iterator iterator) {
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }
//}
