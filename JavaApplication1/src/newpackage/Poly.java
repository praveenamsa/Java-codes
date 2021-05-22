/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author PRAVEENAGRUD
 */
class Car
{
    public void carColor()
    {
        System.out.println("Black color");
    }
}
class CarBmw extends Car
{
    public void carColor()
    {
        System.out.println("BMW car Blue color");
    }
}
class CarTata extends CarBmw
{
    public void carColor()
    {
        System.out.println("TATA car Red color");
    }
}
public class Poly
{
    public static void main(String args[])
    {
        Car obj1 = new Car();
        Car obj2 = new CarBmw();
        Car obj3 = new CarTata();
        CarTata obj = new CarTata();
        obj.carColor();
        obj1.carColor();
       obj2.carColor();
        obj3.carColor();
        
    }
    
}