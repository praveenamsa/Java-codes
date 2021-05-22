/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.Logics;

/**
 *
 * @author PRAVEENAGRUD75
 */
public class digits {
    public static void main(String[] args) {
        int n = 999888, r = 0;
        while(n !=0 )
        {
            r = r*10;
            r = r+n%10;
            n = n/10;
        }
        System.out.println(r);
    }
}
