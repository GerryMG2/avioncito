/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asientosvuelo;

/**
 *
 * @author User
 */
public class FactoryAsientos {
    public static Asiento getAsiento(int x, int y){
        Asiento asiento = null;
        
        boolean pasillo = x == 3 || x == 4;
        boolean claseEconomica =  y < 6;
        boolean pasilloEjecutivo = x == 1 || x == 6;
        
        if(pasillo){
            //pasillo
            asiento = new Asiento(x, y);
        } else {
            if (claseEconomica) {
                //si no es pasillo y es clase economica es asiento
                asiento = new Asiento(x, y);
                asiento.existe = true;
                asiento.uso = false;
            } else {
                if (pasilloEjecutivo) {
                    // si es pasillo en la clase ejecutiva

                    asiento = new Asiento(x, y);
                } else {
                    // si es un asiento en la clase ejecutuva
                    asiento = new Asiento(x, y);
                    asiento.existe = true;
                    asiento.uso = false;
                }
            }
        }
        return asiento;
    }
    
    public static int getAsientoY(int y){
        return y - 1;
    }
    
    public static int getAsientoX(int x, int y){
        boolean EconomicaClase =  y > 0 && y <= 6;
        boolean OtroLadoEconomico = x > 3 && x <7;
        boolean otroLadoEjecutivo = x > 2 && x < 5;
        
        if(EconomicaClase){
            if(OtroLadoEconomico){
                return x + 1;
            }
            return x - 1;
        }else{
            if(otroLadoEjecutivo){
                if(x==3)return 5;
                return 7;
            }else{
                if(x==1){
                    return 0;
                }
                else{
                    return 2;
                }
            }
        }
        
        
    }
    
}
