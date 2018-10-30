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
public class Consultorio {
    private int id;
    private static int contadorVerde = 0;
    private static int contadorAmarillo = 0;
    private static int contadorRojo = 0;
    private Paciente paciente;
    
    public Consultorio(Colores pColor){
        if (pColor.getPrioridad() == 0){
                contadorRojo++;
                id = contadorRojo;
        }
        else if (pColor.getPrioridad() == 1){
                contadorVerde++;
                id = contadorVerde;
        }
        else if (pColor.getPrioridad() == 2){
                contadorAmarillo++;
                id = contadorAmarillo;
        }
    }
    
    public boolean atender(){
        return false;
    }
    public boolean liberarYAtender(){
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
}
