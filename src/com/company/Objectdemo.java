package com.company;

import net.bytebuddy.asm.Advice;
import net.bytebuddy.implementation.bind.annotation.Super;

import java.sql.SQLOutput;
import java.util.zip.Adler32;

public class Objectdemo {
    public static void main(String[] args) {
        demo d1 = new demo();//
        demo d2 = new demo();
        demo d3 = d1;
        //System.out.println(d1.equals(d3));//比较
        System.out.println(d1.toString());
        System.out.println(d1.hashCode());
        System.out.println(Integer.toHexString(d1.hashCode()));//转为16进制
        Class t= d1.getClass();
        System.out.println(t.getName());
    }

}



class demo {            //Object是所有类父类，继承Object的所有方法
   /*demo(){
       super();
    }   构造方法*/
}

/*class  person{
    int age;
    String name;
    String address;

    person(){

    }

    person(int age,String name){
        this.age = age;
        this.name = name;
    }
    person(int age,String name,String address){
        this.address = address;
        this.age = age;
        this.name = name;
        System.out.println(name);

    }
}

class  useperson {
    public static void main(String[] args) {
        person per = new person(18, "na","45");
        System.out.println(per);
    }
}*/
