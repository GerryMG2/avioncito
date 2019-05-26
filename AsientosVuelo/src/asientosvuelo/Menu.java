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

public class Menu {
    
    private AdministrativeOptions[] opciones;
    boolean end = false;
    private static Menu menu;
    
    private Menu(){
        opciones = new AdministrativeOptions[2];
        opciones[0] = new Mostrar();
        opciones[1] = new Comprar();
    }
    
    public static Menu init(){
        if(menu == null){
            menu  = new Menu();
            return menu;
        }
        return menu;
    }
    
    
    public void start(Scanner input,Avion avion){
        int con = 1;
       while(!end){
           for (AdministrativeOptions op : opciones) {
               System.out.print(con +". ");
               op.MessageExecute();
               con ++;
           }
           con = 1;
           System.out.println("3. Salir");
           
           this.opcion(input,avion);
       }
    }
    
    public void opcion(Scanner input,Avion avion){
        int opcion = Utilidades.getNumero(input,"Ingrese una opcion: ");
        if(this.validate(opcion)){
            if(opcion == 3){
                this.end = true;
            }
            else{
                this.opciones[opcion - 1].execute(input, avion);
            }
        }
    }
    
    
    public boolean validate(int x){
        return x > 0 && x <= 3;
    }
    
}
