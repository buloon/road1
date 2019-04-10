package com.company;
/*
* 出现自定义的异常，自定义一个异常类继承excepton，并对可能出错的方法throw新exception
*
* */
public class yichang {
    public static void main(String[] args)  throws Exception{
        exdemo ex = new exdemo();
        try {
            int xc = ex.div(4,0);
            System.out.println(xc);

        }
            catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
//           e.printStackTrace();
        }
    }

}

class exdemo   {
    int div(int a,int b) throws  ArithmeticException {
        return  a/b;
    }
}
