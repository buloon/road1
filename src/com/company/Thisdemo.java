package com.company;

public class Thisdemo {
    public static void main(String[] args) {
        demo002 d1 = new demo002(4);
        demo002 d2 = new demo002(5);
        System.out.println(d1.compa(d2));
    }

}

/*class  demo002{
    private  int num;
    demo002( int num){
        this.num = num;
    }
    public  boolean compa(demo002 d){
        return  this.num == d.num;
    }
}*/

class  demo002{
    private  int num;
    demo002( int num){
        this.num = num;
    }
    public  int compa(demo002 d){
        System.out.println(this.num);
        return  this.num = d.num;
    }
}


