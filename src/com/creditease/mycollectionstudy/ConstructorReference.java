package com.creditease.mycollectionstudy;
//======================================构造函数引用

class Dog {
 String  name;
 int age=-1;
 Dog(){name="helloDog";}
 Dog(String name){this.name=name;}
 Dog(String name,int age){this.name=name;this.age=age;}
}

interface MakeNoArgs{
    Dog make();
}

interface Make1Args{
    Dog make(String name);
}

interface Make2Args{
    Dog make(String name,int age);
}

/**
 * Dog 有三个构造函数，函数接口内的 make() 方法反映了构造函数参数列表（ make() 方法名称可以不同）。
 *
 * 注意我们如何对 [1]，[2] 和 [3] 中的每一个使用 Dog :: new。 这 3 个构造函数只有一个相同名称：:: new，但在每种情况下都赋值给不同的接口。编译器可以检测并知道从哪个构造函数引用。
 *
 * 编译器能识别并调用你的构造函数（ 在本例中为 make()）
 */
public class ConstructorReference {
    public static void main(String[] args) {
        MakeNoArgs m1=Dog::new;
        Make1Args m2=Dog::new;
        Make2Args m3=Dog::new;

        Dog dn=m1.make();
        Dog d1=m2.make("nifanifadnf");
        Dog d2=m3.make("hello",6);

        System.out.println(dn.name+dn.age);
        System.out.println(d1.name+d1.age);
        System.out.println(d2.name+d2.age);
    }
}
