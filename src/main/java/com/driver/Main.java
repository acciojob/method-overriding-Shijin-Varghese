package com.driver;
import java.util.*;
class Main{
    public static class A{
        public static  String meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A {
        public static  String meth(){
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String args[]){
       B obj=new B();
       obj.meth();
    }
}

