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
public class Methods {
    static void recusionMethod(int num)
    {
        int result = sum(num);
        System.out.println("Sum of "+num+ " is : "+ result);
    }
    static int sum(int a)
    {
        if(a>0)
        {
            return a + sum(a -1);
        }
        else
        {
            return 0;
        }
    }
    
    
}
