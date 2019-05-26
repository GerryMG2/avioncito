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
public class Mostrar extends AdministrativeOptions{

    @Override
    public void MessageExecute() {
        System.out.print("Asientos\n");
    }

    @Override
    public void Action(Avion avion) {
        avion.mostrar();
    }

    @Override
    public boolean Validate(Scanner input) {
        return true;
    }

    @Override
    public void ErrorMessage() {
        System.out.println("Algo paso");
    }
    
}
