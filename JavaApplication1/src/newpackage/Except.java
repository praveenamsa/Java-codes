/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author PRAVEENAGRUD
 */
public class Except {
    public static void main(String args[]){
        try{
             int x = 0 , y = x--/--x;
             System.out.println(y);
        }
        catch(Exception e){
            System.out.println("Zero devided by Error");
        }
        System.out.println("xxxxxxxxxxxxxxxx Error");
        
//        finally{
//            System.out.println("Some error occured in Try and catch block");
//        }
//        Pattern paternObj = Pattern.compile("Durga", Pattern.CASE_INSENSITIVE);
//        Matcher mathcherObj = paternObj.matcher("PraveenDurga75");
//        boolean matched = mathcherObj.find();
//        if(matched)
//            System.out.println("Item Found");
//        else
//            System.out.println("Item Not Found");
 
    }
    
}
