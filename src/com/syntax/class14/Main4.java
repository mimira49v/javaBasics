package com.syntax.class14;

public class Main4 {

    //Write a method to return whether given number is prime or not?

    boolean isPrime(int number){

        boolean isPrime=true;

        if(number>1){
            for(int i=2; i<number; i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }
        return isPrime;
    }

    public static void main(String[] args) {

        Main4 objectName=new Main4();
        System.out.println(objectName.isPrime(13));
    }
    }
