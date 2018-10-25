
package Cola;

/**
 * @author Dylan
 * @param <T>
 */

public class Node<T> {
    private Paciente element;
    private Node<T> next;
    
    public Node(){
        this.element=null;
        this.next=null;
    }
    
    public Node(Paciente element){
        this.element=element;
        this.next=null;
    }
    
    public Node(Paciente element, Node<T> next) {
        this.element = element;
        this.next = next;
    }

    public Paciente getElement() {
        return element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setElement(Paciente element) {
        this.element = element;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    
}
