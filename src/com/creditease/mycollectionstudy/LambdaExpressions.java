package com.creditease.mycollectionstudy;

interface Description{
    String brief();
}

interface Body{
    String detailed(String head);
}

interface Multi{
    String twoArg(String head,Double d);
}

public class LambdaExpressions {
    static Body bod=h ->h+"NO parents!";
    static Body bod2=(h)->h+"More details";
    static Description desc=()->"short info";
    static Multi mult=(h,n)->h+n;
    static Description moreLines=()->{
        System.out.println("moreLines()");
        return "from moreLines()";
    };

    public static void main(String[] args) {
        System.out.println(bod.detailed("Oh!"));
        System.out.println(bod2.detailed("HI!"));
        System.out.println(desc.brief());
        System.out.println(mult.twoArg("pi!",3.1415926));
        System.out.println(moreLines.brief());
    }
}
