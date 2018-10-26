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
public class Node {

    //atributos

    private Paciente element;
    private Node next;

    //Constructores
    public Node() {
        this.element = null;
        this.next = null;
    }

    public Node(Paciente element) {
        this.element = element;
        this.next = null;
    }

    public Node(Paciente element, Node next) {
        this.element = element;
        this.next = next;
    }

    //metodos

    public Paciente getElement() {
        return this.element;
    }

    public void setElement(Paciente element) {
        this.element = element;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
