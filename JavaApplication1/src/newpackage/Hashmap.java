/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
import java.util.HashMap;
import java.util.HashSet;
/**
 *
 * @author PRAVEENAGRUD
 */
public class Hashmap {
    public static void main(String args[]){
        HashMap<Integer, String> myhash = new HashMap<Integer, String>();
        HashSet<String> hashset = new HashSet<String>();
        myhash.put(1,"One");
        myhash.put(2,"Two");
        myhash.put(3,"Three");
        myhash.put(4,"Four");
        myhash.put(5,"Five");
        System.out.println(myhash);
        for(int a:myhash.keySet())
            System.out.println("Key : "+a+" Value : "+myhash.get(a));
        System.out.println();
        for(String a:myhash.values())
            System.out.print(a+" ");
        
        
        
    }
    
}
