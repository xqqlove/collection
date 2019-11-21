package com.creditease.mycollectionstudy;

public class VarableNumberOfArgument {
    public static void f(int i){
        System.out.println("A");
    }
    public static void f(int i,int j){
        System.out.println("B");
    }
    public static void f(int i,int ...j){
        System.out.println("C");
    }

    public static void g(int ...i){
        System.out.println("D");
    }
    public static void g(int i,int...j){
        System.out.println("F");
    }
    public static void h(int ...i){
        System.out.println("G");
    }
    public static void h(Integer ... i){
        System.out.println("H");
    }
    public static void main(String[] args) {
        f(1);
        f(1,2);
        f(1,2,3,4);
//        g(1,2,3,4)
//        h(1,2)
    }
}
