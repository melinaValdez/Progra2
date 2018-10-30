/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecemergency;

import static tecemergency.Colores.*;
import static tecemergency.Enfermedades.*;

/**
 *
 * @author Melina
 */
public class TECEmergency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Paciente paciente1=new Paciente("Dylan", "25", "Dolor", VERDE, INFARTO);
        Paciente paciente2=new Paciente("juan", "13", "nada", ROJO, DOLOR);
        Paciente paciente3=new Paciente("pepe", "13", "nada", ROJO, PARTO);
        Paciente paciente4=new Paciente("andres", "13", "nada", AMARILLO, HERIDA);
        LQueue cola=new LQueue();
        cola.enqueueEgresos(paciente1);
        cola.enqueueEgresos(paciente2);
        cola.enqueueEgresos(paciente3);
        cola.enqueueEgresos(paciente4);        
        
        System.out.println(cola.toString());
        
        new Configuracion().setVisible(true);
    }
}
