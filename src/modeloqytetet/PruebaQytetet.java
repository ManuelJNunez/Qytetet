/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloqytetet;

import java.util.ArrayList;

/**
 *
 * @author manu
 */
public class PruebaQytetet {
    static Qytetet juego = new Qytetet();
    
    public PruebaQytetet(){
        juego.inicializarCartasSorpresa();
    }
    
    private ArrayList ValorMayorQueCero(){
        ArrayList<Sorpresa> mazo = juego.getMazo();
        ArrayList<Sorpresa> mayorquecero = new ArrayList<>();
        
        for(int i = 0; i < mazo.size(); ++i){
            if(mazo.get(i).getValor() > 0)
                mayorquecero.add(mazo.get(i));
        }
        
        return mayorquecero;
    }
    //HOLA//
    private ArrayList CartasIrA(){
        ArrayList<Sorpresa> mazo = juego.getMazo();
        ArrayList<Sorpresa> iracasilla = new ArrayList<>();
        
        for(int i = 0; i < mazo.size(); ++i){
            if(mazo.get(i).getTipo() == TipoSorpresa.IRACASILLA)
                iracasilla.add(mazo.get(i));
        }
        
        return iracasilla;
    }
    
    private ArrayList FiltrarTipo(TipoSorpresa tipo){
        ArrayList<Sorpresa> mazo = juego.getMazo();
        ArrayList<Sorpresa> iracasilla = new ArrayList<>();
        
        for(int i = 0; i < mazo.size(); ++i){
            if(mazo.get(i).getTipo() == tipo)
                iracasilla.add(mazo.get(i));
        }
        
        return iracasilla;
    }
    
    
    public static void main(String []args){
        PruebaQytetet prueba = new PruebaQytetet();
        
        ArrayList<Sorpresa> filtrado = juego.getMazo();
        
        for(Sorpresa s: filtrado)
            System.out.println(s);
        
        filtrado = prueba.ValorMayorQueCero();
        
        System.out.println("\nCartas con valor mayor que 0:");
        
        for(Sorpresa s: filtrado)
            System.out.println(s);
        
        filtrado = prueba.CartasIrA();
        
        System.out.println("\nCartas del tipo IrA:");
        
        for(Sorpresa s: filtrado)
            System.out.println(s);
        
        System.out.println("");
        
        for(TipoSorpresa tipo: TipoSorpresa.values()){
            System.out.println("Sorpresas del tipo: " + tipo);
            filtrado = prueba.FiltrarTipo(tipo);
            for(Sorpresa s: filtrado)
                System.out.println(s);
        }
    }
}
