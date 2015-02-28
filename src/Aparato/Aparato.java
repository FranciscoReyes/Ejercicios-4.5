/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aparato;
    
/**
 *
 * @author Usuario
 */
public class Aparato {
    int potencia;
    static int consumo = 0;
    String nombre;
    static int consumoTotal;
    boolean encendido = false;
    
    Aparato(String nuevoAparato, int wattios) {
        String aparato = nuevoAparato;
        nombre = nuevoAparato;
        potencia = wattios;   
    }
    
    static int getConsumo(){
        return consumo;
    }
    
    static int getconsumoTotal() {
        return consumoTotal;
    }
      
    void interruptor(boolean estado) {
        
        if (estado == false && encendido==true) {
            consumoTotal-=potencia;
            consumo = 0;
        } else {
            if (estado == true && encendido == false) {
                consumoTotal+=potencia;
                encendido = true;
                consumo = potencia;
            }
        }
    }
    
    
    
    
}
