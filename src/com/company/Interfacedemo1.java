package com.company;

public class Interfacedemo1 implements Interfacedemo {
    public void open(){
        System.out.println("打开 ");
    }
    public void  close(){
        System.out.println("关闭");
    }
}
/*public class interfacedemo2 implements  Interfacedemo{
    @Override
    public void open() {
        if ()
    }

    @Override
    public void close() {

    }
}*/
class useinterface {
    public void  run(){
        System.out.println("use");
    }
    public void use(Interfacedemo p){
        p.open();
        p.close();
    }

    }

 class shiyong{
     public static void main(String[] args) {
         useinterface u = new useinterface();
         u.run();
         u.use(new Interfacedemo1());
         Interfacedemo dmo = new Interfacedemo1();
         dmo.open();
         dmo.close();

     }
 }


