/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asientosvuelo;

import java.util.Scanner;

/**
 *
 * 
 */
public abstract class AdministrativeOptions {
    public AdministrativeOptions(){
        
    }
    
    public abstract void MessageExecute();
    public abstract void Action(Avion avion);
    public abstract boolean Validate(Scanner input);
    public abstract void ErrorMessage();
    public void execute(Scanner input, Avion avion){
        
        if(this.Validate(input)){
        this.Action(avion);
        }else{
            this.ErrorMessage();
        }
    }
    
}
