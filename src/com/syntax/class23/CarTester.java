package com.syntax.class23;

public class CarTester {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.start();
        Suzuki suzuki=new Suzuki();
        suzuki.park();
        suzuki.start();
        System.out.println("***********************");
        Car car=new BMW();
        car.start();
        car=new Tesla();
        car.start();
        car=new Suzuki();
        car.start();
        // BMW bmw1=new Car();
        // Object str=new String("sbdf");
    }
}
