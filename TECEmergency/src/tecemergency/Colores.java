/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecemergency;

/**
 *
 * @author Melina
 */
public enum Colores{
    ROJO(0,'R',"ROJO"), VERDE(1,'V',"VERDE"), AMARILLO(2,'A',"AMARILLO");
    private final int prioridad;
    private final char inicial;
    private final String codigo;
    
    Colores(int pPrioridad, char pInicial, String pCodigo){
        prioridad = pPrioridad;
        inicial = pInicial;
        codigo = pCodigo;
    }
}