package com.creditease.mycollectionstudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionArrayList {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer[] integers={6,7,8,9,10};
        collection.addAll(Arrays.asList(integers));
    }
}
