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
    private static int contadorVerde;
    private static int contadorAmarillo;
    private static int contadorRojo;
    private Paciente paciente;
    
    public Consultorio(Colores pColor){
        switch (pColor.getPrioridad()){
            case 0:
                contadorRojo++;
                id = contadorRojo;
                break;
            case 1:
                contadorVerde++;
                id = contadorVerde;
                break;
            case 2:
                contadorAmarillo++;
                id = contadorAmarillo;
                break;
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
