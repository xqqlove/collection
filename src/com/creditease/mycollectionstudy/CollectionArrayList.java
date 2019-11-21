package com.creditease.mycollectionstudy;

import java.util.*;

public class CollectionArrayList {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer[] integers={6,7,8,9,10};
        collection.addAll(Arrays.asList(integers));
        Collections.addAll(collection,3,4,5,6,7,89);
        Collections.addAll(collection,integers);
        List<Integer> list=Arrays.asList(3,5,6,7,8);
        list.set(1,99);
        System.out.println(collection.contains(6));
        System.out.println(collection.contains("a"));

        System.out.println(collection);
        collection.remove(integers);
        System.out.println(collection);
        Iterator it= collection.iterator();
        while (it.hasNext()){
            Object p=it.next();
            it.remove();
            System.out.println(p);
        }
    }
}
