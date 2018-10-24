/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecemergency;

import static tecemergency.Colores.*;

/**
 *
 * @author Melina
 */
public class TECEmergency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Paciente paciente1 = new Paciente("Rodrigo","05-10-96","Tiene dolor",AMARILLO);
    Paciente paciente2 = new Paciente("Monica","5","Embarazo", ROJO);
    new Registro().setVisible(true);
    }
}
