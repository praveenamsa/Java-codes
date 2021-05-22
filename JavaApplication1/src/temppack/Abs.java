/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temppack;
/**
 *
 * @author WINDOWS
 */
public class Abs{
   public Abs()
   {
        System.out.println("This is Abs class !!");
         
        char[] name = {'a','b','c','d','f','d','r','w','j'};
        System.out.println("Before reversing a String  !!");
        for(int i = 0; i<name.length; i++)
        {
            System.out.print(name[i]);
        }
        System.out.println();
        System.out.println("After reversing a String !!");
        int a = name.length - 1;
        int c = a; 
        for(int j = 0; j <= c; j++)
        {
            System.out.print(name[a]);
            a -- ;
        }
        System.out.println();
         
        char[] charArray1 = {'a','b','c','d','f','d','r','w','j'};
        System.out.println("For each Loop \f");
        
        for(char i : charArray1)
        {
            System.out.println(i);
        }
        System.out.println("Length of an array : "+charArray1.length);
        for(int i = 0; i<charArray1.length;i++)
        {
            System.out.println(charArray1[i]);
        }
    } 
}
