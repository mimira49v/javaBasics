package com.syntax.class23;

public class AlisParent {
    String girlName="Selma";
    double money=100000;
    void marry(){
        System.out.println("Ali should marry "+girlName);
    }
}
class Ali extends AlisParent{
    String girlName="Rihanna";
    void marry(){
    System.out.println("But dad i wnat to marry "+girlName);
    super.marry();
    }
}
