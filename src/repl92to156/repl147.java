package repl92to156;
/*
In carObject class:

Create instance variables as below.

model
price,
quantity
Create a constructor that will initialize instance variables.

Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result.

run the application in Main Class

Expected Output:

Toyota 2019 Stock Value 2500000.0
BMW 2019 Stock Value 652980.0
copied!
Toyota 2019 Stock Value 2500000.0
BMW 2019 Stock Value 652980.0
Assignment Goal. Clean Code, This Keyword, Method Creation, Mathematics Operations.
 */
public class repl147 {

    public static void main (String [] agrs ) {

        CarObjects obj1= new CarObjects ("Toyota", 2500000.0);
        obj1.carStockValue();

        CarObjects obj2= new CarObjects ("BMW", 652980.0);
        obj2.carStockValue();
    }
}

class CarObjects{
    String  model;
    double price;
    String  quantity;
    CarObjects (String model, double price) {
        this.model= model;
        this.price= price;
        this.quantity= "2019 Stock Value";
    }
    void carStockValue() {
        System.out.println(model + " " + quantity + " "+ price );
    }
}