package com.company;

import com.sun.corba.se.impl.ior.GenericTaggedComponent;
import com.sun.org.apache.xml.internal.serializer.OutputPropertiesFactory;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*public static void main(String[] args) {
	// write your code here
        int s =1;
     System.out.println(s);
     WebDriver driver = new ChromeDriver();
        List <String>  list = new ArrayList<>();
        list.add("s");


    } */
    public static void main(String[] args) throws  Exception{
               getlocaror();
    }
    public  static By getlocaror( )throws Exception{
        String locator ="1,2,3,4,5";
         String locatortyper = locator.split(",")[0];
         String locatorvaule = locator.split(",")[1];

        if (locatortyper.toLowerCase().equals("idea"))
            return By.id(locatorvaule);
        else throw new  Exception("cuowu ");
    }


}
