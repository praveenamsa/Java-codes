/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.Logics;
import java.util.Scanner;
/**
 *
 * @author PRAVEENAGRUD75
 */
public class primeNumber {
    public static void main(String[] args) {
        int start = 2,end;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter end value : ");
        end = obj.nextInt();
        for(int i = start; i<=end;i++)
        {
            for(int j = 2; j <= end;j++)
            {
                if(i % j == 0)
                    break;
                else
                    System.out.println(i);
                    break;
            }
        }
            
       
        
    }
    
}