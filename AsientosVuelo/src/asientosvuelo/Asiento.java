/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asientosvuelo;

import java.io.Console;

/**
 *
 * @author User
 */
public class Asiento {
   
    int fila;
    int columna;
    boolean existe = false;
    boolean uso = false;
    
    
    public Asiento(int fila, int columna){
        this.fila = fila; 
        this.columna = columna;
    }
    
    
    public void show(){
        if(existe){
            if(uso){
                System.out.print("\033[0;32m"+ "■" + "\033[0m");
            }
            else{
                System.out.print("□");
            }
        }else{
            System.out.print("■");
        }
    }
}
