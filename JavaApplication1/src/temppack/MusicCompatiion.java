/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temppack;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PRAVEENAGRUD75
 */
public class MusicCompatiion {
    static int temp;
    public static void main(String[] args)
    {
        List<Integer> alist = new ArrayList();
        int n = 5, m = 7;
        int[] arr = new int[100];
        arr[0] = 10;
        arr[1] = 8;
        arr[2] = 6;
        arr[3] = 4;
        arr[4] = 3;
        temp = arr[0]/2;
        arr[5] = temp;
        arr[0] = temp;
        temp = arr[1]/2;
        arr[1] = temp;
        arr[6] = temp;
        for(int a: arr)
        {
            alist.add(a);
        }
        Integer max = Collections.max(alist);
        System.out.println(max);
        
       
        
        //temp = arr[0] = 
        
    }
}
