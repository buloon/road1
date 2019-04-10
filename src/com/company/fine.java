package com.company;

import org.openqa.selenium.interactions.SourceType;

import java.util.function.Function;

class fine {
     void  method1(){
         System.out.println("fulei_1");
     }
     void method2(){
         System.out.println("fulei_2");
     }
     static  void method3(){
         System.out.println("jintai");
     }
}


class ok extends fine{
     void  method1(){
         System.out.println("zilei_1");
     }
     void method4(){
         System.out.println("zilei_4");
     }
     static  void method5(){
         System.out.println("zilie_jingtai");
     }
}
class  notok extends fine{
    void  method1(){
        System.out.println("子类");
    }
    void  method2(){
        System.out.println("子类2");
    }
}


 class  mmk {


     public static void main(String[] args) {
           fine m = new ok();
           m.method3();
           ((ok) m).method5();
           ((ok) m).method4();
           function(new ok());

           //fine d = new notok();
           //d.method1();
         function(new notok());
     }
     public static  void function( fine x){
         x.method1();
         x.method2();
     }

 }