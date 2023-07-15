package com.driver;

class classA {
    public String meth() {
        return "Invoking method from class A";
    }
}

class classB extends classA {


    @Override
    public String meth() {
        return "Method is overridden in Extendend class B";
    }
}
public class Main {
    public static void main(String[] args) {
        classB obj = new classB();
        System.out.println(obj.meth());
    }
  
}