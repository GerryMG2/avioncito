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
public class Comprar extends AdministrativeOptions{
    
    int x,y;

    @Override
    public void MessageExecute() {
        System.out.print("Comprar\n");
    }

    @Override
    public void Action(Avion avion) {
        avion.buy(x, y);
    }

    @Override
    public boolean Validate(Scanner input) {
        
        
        this.y = Utilidades.getNumero(input, "Ingrese la fila: ");
        this.x = Utilidades.getNumero(input, "Ingrese la Columna: ");
        //agregar validacion
        return true;
    }

    @Override
    public void ErrorMessage() {
        System.out.println("Algo paso");
    }

    
}
