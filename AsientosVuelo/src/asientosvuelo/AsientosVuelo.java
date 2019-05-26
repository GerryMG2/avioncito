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
public class AsientosVuelo {

    /**
     * @param args the command line arguments
     */
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        Avion avion = new Avion("avioncito", 2);
        Menu menu = Menu.init();
        menu.start(input, avion);
        // TODO code application logic here
    }
    
}
