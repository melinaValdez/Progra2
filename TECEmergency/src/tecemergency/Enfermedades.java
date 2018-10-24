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
public enum Enfermedades {
    INFARTO(0,'I',"INFARTO"), HERIDA(1,'H',"HERIDA"), PARTO(2,'P',"PARTO"), DOLOR(3,'D',"DOLOR"), QUEBRADURA(4,'Q',"QUEBRADURA"), OTRO(5,'O',"OTRO");
    private final int prioridad;
    private final char codigo;
    private final String enfermedad;
    
    Enfermedades(int pPrioridad, char pCodigo, String pEnfermedad){
        prioridad = pPrioridad;
        codigo = pCodigo;
        enfermedad = pEnfermedad;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public char getCodigo() {
        return codigo;
    }

    public String getEnfermedad() {
        return enfermedad;
    }
    
}
