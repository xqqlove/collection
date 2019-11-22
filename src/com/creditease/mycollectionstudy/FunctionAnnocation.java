package com.creditease.mycollectionstudy;
@FunctionalInterface
interface Functional{
    String goodbye(String arg);
}
interface FunctionalNoAnn {
    String goodbye(String arg);
}
public class FunctionAnnocation {
    public String goodbye(String arg) {
        return "Good, " + arg;
    }
    public static void main(String[] args) {
        FunctionAnnocation fa =
                new FunctionAnnocation();
        Functional f = fa::goodbye;
        FunctionalNoAnn fna = fa::goodbye;
        // Functional fac = fa; // Incompatible
        Functional fl = a -> "Goodbye, " + a;
        FunctionalNoAnn fnal = a -> "Goodbye, " + a;
        System.out.println(f.goodbye("arg1"));
        System.out.println(fna.goodbye("arg11"));
        System.out.println(fl.goodbye("arg2"));
        System.out.println(fnal.goodbye("arg222"));
    }
}
