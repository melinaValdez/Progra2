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
public class NodeConsultorio {
      //atributos

    private Consultorio element;
    private NodeConsultorio next;

    //Constructores
    public NodeConsultorio() {
        this.element = null;
        this.next = null;
    }

    public NodeConsultorio(Consultorio element) {
        this.element = element;
        this.next = null;
    }

    public NodeConsultorio(Consultorio element, NodeConsultorio next) {
        this.element = element;
        this.next = next;
    }

    //metodos

    public Consultorio getElement() {
        return this.element;
    }

    public void setElement(Consultorio element) {
        this.element = element;
    }

    public NodeConsultorio getNext() {
        return this.next;
    }

    public void setNext(NodeConsultorio next) {
        this.next = next;
    }
}