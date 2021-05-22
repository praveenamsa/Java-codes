/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

/**
 *
 * @author PRAVEENAGRUD
 */
public class Arraylist {
    public static void main(String args[]){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Benz");
        System.out.println(cars.get(1));
        cars.set(1,"TATA");
        System.out.println(cars.get(1));
        for(String a: cars)
            System.out.println(a);
        System.out.println("Java ArrayList");
        ArrayList<Integer> count = new ArrayList<Integer>();
        for(int i = 0; i<10;i++)
        {
            count.add(i);
        }
        for(int k: count)
            System.out.print(k+ " ");
        System.out.println("\nJava LinkedList");
        LinkedList<Integer> number = new LinkedList<Integer>();
        for(int i = 0; i<7;i++)
        {
            number.add(i);
        }
        number.addFirst(10);
        number.remove(1);
        for(int k: number)
            System.out.print(k+ " ");
        System.out.println("\nJava Iterator");
        Iterator<String> it = cars.iterator();
//        System.out.println(it.next());
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
    }
}
