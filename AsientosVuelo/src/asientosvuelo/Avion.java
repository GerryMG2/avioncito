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
public class Avion {
    public int longitud = 0;
    public String name;
    public Asiento[][] asientos;
    
    public Avion(String name, int tipo){
        this.name = name;
        if(tipo == 1){
            longitud = 6;
        }else{
            longitud = 11;
        }
        asientos = new Asiento[longitud][8];
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < 8; j++) {
                asientos[i][j] = FactoryAsientos.getAsiento(j, i);
            }
        }
        
    }
    
    public void mostrar(){
        System.out.println("   ①②③  ④⑤⑥");
        for (int i = 0; i < longitud; i++) {
            
            if(i==6)System.out.println("   ① ②   ④ ⑤");
            System.out.print(i+1);
            if(i+1 == 10 || i+1 == 11) System.out.print(" ");
            else System.out.print("  ");
            for (int j = 0; j < 8; j++) {
                
                asientos[i][j].show();
            }
            System.out.println("");
        }
    }
    
    public void buy(int x, int y){
        int xx;
        int yy;
        if (this.Validate(x, y)) {
            xx = FactoryAsientos.getAsientoX(x, y);
            yy = FactoryAsientos.getAsientoY(y);
            if (this.asientos[yy][xx].uso == true) {
                System.out.println("Ya esta usado");
            } else {
                this.asientos[yy][xx].uso = true;
                System.out.println("Se ha comprado el asiento.");

            }
        } else {
            System.out.println("Invalidos");
        }

    }
    
    
    private boolean Validate(int x, int y ){
        
        boolean yFine = y <= this.longitud && y > 0;
        boolean Economico = y <= 6;
        boolean xFineEconomico = x <= 6 && x > 0;
        boolean xFineEjecutivo = x <= 4 && x > 0;
        
        return yFine && ((Economico && xFineEconomico) || (!Economico && xFineEjecutivo));
        
        
        
    }
    
    
}
