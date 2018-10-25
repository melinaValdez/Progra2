
package Cola;

public class MainClass {

    public static void main(String[] args) {
        //prueba de cola de prioridad
        Paciente paciente1=new Paciente("Dylan", "25", "Dolor", "2", "[Q]", "2");
        Paciente paciente2=new Paciente("juan", "13", "nada", "2","[H]", "3");
        Paciente paciente3=new Paciente("juan2", "13", "nada", "2","[O]", "3");
        Paciente paciente4=new Paciente("juan3", "13", "nada", "2","[I]", "3");
        Queue cola=new Queue();
        cola.enqueue(paciente1);
        cola.enqueue(paciente2);
        cola.enqueue(paciente3);
        cola.enqueue(paciente4);
        System.out.println(cola.toString());
        
        
    }
    
}
