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
public class Sample {
    public static void main(String args[])
    {
        String name = "Praveen";
        
        int x = 3, y = 10, z = 16;
        long s = 5354345353453453L;        
        float a = 5.23f; //Float is only six or seven decimal point
        double fd = 54.5454d; //Double can have a precision of about 15 digits
        boolean isJavaFan = true ;
        char gender = 'M';
        char n1 = 75;
        char n2 = 65;
        char n3 = 55;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(x+y+z+" "+name);
        int myInt = (int) fd;
        x += 3;
        System.out.println(x);
        String lastName = "K";
        System.out.println(name  +" "+ lastName);
        System.out.println(name.concat(lastName));
        System.out.println("My String \f");
        System.out.println("Math methods\r");
        System.out.println(Math.sqrt(100));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random() * 4);
        
        System.out.println(10 != 10);
        String result = (20 < 10)? "Good morning":"Good afternoon";
        System.out.println(result);
        System.out.println("Swith Statemnt");
        char[] charArray = {'a','b','c','d','f','d','r','w','j'};
        int randomNum = (int)(Math.random() * 4);
        for(int i = 0 ; i<= randomNum; i++)
        {
            int randomNum1 = (int)(Math.random() * 10);
            switch(charArray[randomNum1])
            {
                case 'a':printName('a'); break;
                case 'b':printName('b'); break;
                case 'c':printName('c'); break;
                case 'd':printName('d'); break;
                default:System.out.println("No data found !!!");
 
            }
        }
        System.out.println("For each loop for for character Array");
        for (char p : charArray)
        {
            System.out.println(p);
        }
    }
    static void printName(char n)
    {
        if(n == 'a')System.out.println("A");
        if(n == 'b')System.out.println("B");
        if(n == 'c')System.out.println("C");
        if(n == 'd')System.out.println("D");
    }

}
