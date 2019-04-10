package com.company;
/*内部类可以直接访问外部类中成员变量
外部类访问内部类，必须建立内部类对象*/


public class Innerclassdemo {
    public static void main(String[] args) {
        outer o =new outer();
        o.method();
       // new outer.inner().function(); 当inner内部类为静态static时可以使用
        /*outer.inner ins = new outer().new inner();
        ins.function();*/
    }


}



class  outer{
    private  int x= 3;
   private class inner{
        int x = 4;
        void  function(){
            int x = 5;
            System.out.println("inner x="+x);
            System.out.println(this.x);
            System.out.println(outer.this.x);
        }
    }
    void  method(){
        /*inner inner = new inner();
        inner.function();*/
        new  inner().function();
    }
}

