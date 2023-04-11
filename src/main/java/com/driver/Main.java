package com.driver;
import java.util.*;
class A{
    public String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    public String meth(){
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String args[]){
        B a=new B();
         a.meth();
         System.out.println(a.meth());
        System.out.println(a.meth());
    }
}
