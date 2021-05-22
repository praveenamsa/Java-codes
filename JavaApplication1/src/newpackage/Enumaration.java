/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author PRAVEENAGRUD
 */
enum Level
{
    LOW,
    MEDIUM,
    HIGH
}
public class Enumaration {
    public static void main(String args[])
    {
        Scanner myobj = new Scanner(System.in);
        LocalDateTime mydate = LocalDateTime.now();
        System.out.println("Before formatting : "+mydate);
        DateTimeFormatter myformat = DateTimeFormatter.ofPattern("E,dd-MM-yyyy HH:mm:ss");
        String mydate1 = mydate.format(myformat);
        System.out.println("After formatting : " + mydate1);
        int a;
        System.out.print("Enter a value : ");
        a = myobj.nextInt();
        Level myvar = Level.HIGH;
        System.out.println(myvar);
        for(Level myvarls : Level.values())
        {
            System.out.println(myvarls);
        }
    }
}
