package com.driver;
import java.util.*;
class Main{
    static class A{
        static public String meth(){
            return "Invoking method from class A";
        }
    }
   static class B extends A {
        static public String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String args[]){
       B a=new B();

        System.out.println(a.meth());
    }
}

