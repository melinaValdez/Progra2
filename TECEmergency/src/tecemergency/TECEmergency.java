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
    Consultorio cons1 = new Consultorio(ROJO);
    Consultorio cons2 = new Consultorio(ROJO);
    Consultorio cons3 = new Consultorio(VERDE);
    LinkedList rojos = LinkedList.getConsultoriosRojos();
    rojos.append(cons1);
    rojos.append(cons2);
    LinkedList verdes = LinkedList.getConsultoriosVerdes();
    verdes.append(cons3);
    new PantallaPrincipal().setVisible(true);
    }
}
