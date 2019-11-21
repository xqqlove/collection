package com.creditease.mycollectionstudy;
//===============================================函数式编程==================================
interface Strategy{
    String approach(String msg);
}

class Soft implements Strategy{

    @Override
    public String approach(String msg) {
        return msg.toLowerCase()+"?";
    }
}

class Unrelated{
   static String twice(String msg){
       return msg+" "+msg;
   }
}

public class Strategize {
    Strategy strategy;
    String msg;
    Strategize(String msg){
        strategy=new Soft();
        this.msg=msg;
    }
    void communication(){
        System.out.println(strategy.approach(msg));
    }
    void changeStrategy(Strategy strategy){
        this.strategy=strategy;
    }

    public static void main(String[] args) {
        Strategy [] strategies={new Strategy() {
            public String approach(String msg) {
                return msg.toUpperCase()+"!";
            }
        },//匿名类
         msg->msg.substring(0,5),//lambda表达式
         Unrelated::twice  //方法应用
        };

        Strategize s=new Strategize("hello there");
        s.communication();
        for (Strategy newStra:strategies){
            System.out.println(newStra.approach(s.msg));
        }
    }
}
