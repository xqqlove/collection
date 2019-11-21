package com.creditease.mycollectionstudy;


import java.util.*;

public class PrintCollection {
    static Collection fill(Collection<String> collection){
        collection.add("a");
        collection.add("b");
        collection.addAll(Arrays.asList("c","d"));
        Collections.addAll(collection,"4","5");
        return collection;
    }
    static Map fill(Map<String,String> m){
        m.put("rat","A");
        m.put("bob","B");
        m.put("pop","C");
        return m;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<>()));
        System.out.println(fill(new LinkedList<>()));
        System.out.println(fill(new HashMap<>()));
        System.out.println(fill(new HashSet<>()));
        System.out.println(fill(new LinkedHashMap<>()));
        System.out.println(fill(new LinkedHashSet<>()));
        System.out.println(fill(new TreeMap<>()));
        System.out.println(fill(new TreeSet<>()));
    }
}
