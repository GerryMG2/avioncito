/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asientosvuelo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Utilidades {
    
    public static int getNumero(Scanner sc,String str){
        int a = 0;
        while (true) {

            try {
                System.out.print(str);
                a = sc.nextInt();
                break;
            } catch (Exception e) {
                sc.next();
                System.out.println("Invalido");
                System.out.print("str");
            }
        }
        return a;
    }
    
    
}
