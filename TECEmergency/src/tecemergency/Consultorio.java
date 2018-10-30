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
    private static int contadorVerde=0;
    private static int contadorAmarillo=0;
    private static int contadorRojo=0;
    private static int contadorEgresos=0;
    private Paciente paciente;

    public Consultorio(){
        contadorEgresos++;
        id=contadorEgresos;
    }

    public Consultorio(Colores pColor){
        switch (pColor.getPrioridad()) {
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
            default:
                break;
        }
    }

    public boolean atender(LQueue pQueue){
        if (pQueue.getFront().getNext() == null){
            return false;
        } else{
            paciente = pQueue.dequeue();
        }
        return false;
    }
    public boolean liberarYAtender(LQueue pQueue){
        if (pQueue.getFront().getNext() == null){
            return false;
        } else{
            //pasar el paciente a la lista de egresos
            paciente = pQueue.dequeue();
        }
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
