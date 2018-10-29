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
public class LinkedList {
    //atributos LinkedList
    private NodeConsultorio head;
    private NodeConsultorio current;
    private NodeConsultorio tail;
    private int position;
    private int size;
    private static LinkedList consVerdes;
    private static LinkedList consRojos;
    private static LinkedList consAmarillos;

    //constructores LinkedList

    /**
     * Contructor predeterminado
     */
    public LinkedList() {
        this.head = new NodeConsultorio();
        this.current = this.head;
        this.tail = this.head;
        this.size = 0;
        this.position = -1;
    }
    //Patron singleton
    public static LinkedList getConsRojos() {
       if(consRojos == null) {
          consRojos = new LinkedList();
       }
       return consRojos;
    }
    
    public static LinkedList getConsVerdes() {
       if(consVerdes == null) {
          consVerdes = new LinkedList();
       }
       return consVerdes;
    }
    
    public static LinkedList getConsAmarillos() {
       if(consAmarillos == null) {
          consAmarillos = new LinkedList();
       }
       return consAmarillos;
    }
    /**
     * Agrega un nuevo elemento a la lista
     * @param element El elemento a agregar
     */
    public void insert(Consultorio element) {
        //insertar en cualquier posición
        NodeConsultorio newNode = new NodeConsultorio(element, this.current.getNext());
        this.current.setNext(newNode);
        //necesario si se está insertando al final de la lista
        if (this.current == this.tail) {
            this.tail = tail.getNext();
        }
        this.size++;

    }

    public void append(Consultorio element) {
        //siempre se pega al final de la lista
        NodeConsultorio newNode = new NodeConsultorio(element);
        this.tail.setNext(newNode);
        this.tail = newNode;
        this.size++;
    }

    public void remove() {
        //verificar que la lista no está vacía
        if ((this.head == this.current) && (this.head == this.tail)){
            System.out.println("Lista vacía, no se puede remover ningún elemento");
            return;
        } //también if (this.size == 0) ...

        //en temp se va a almacenar el nodo ANTERIOR al que se quiere borrar
        NodeConsultorio temp = head;
        while (temp.getNext() != this.current) {
            temp = temp.getNext();
        }
        //borrar la referencia al nodo actual
        temp.setNext(this.current.getNext());
        //necesario si se esta borrando el último nodo
        if (this.current == this.tail) {
            this.current = this.tail = temp;
            this.position--;
        }
        else
            //necesario si se está borrando un nodo diferente al último
            this.current = this.current.getNext();

        //disminuir el tamaño
        this.size--;
    }

    public void clear() {
        this.head = this.tail = this.current = new NodeConsultorio();
        this.position = -1;
        this.size = 0;
    }

    public Object getElement(){
        return this.current.getElement();
    }

    public int getSize() {
        return this.size;
    }

    public boolean next() {
        if (this.current == this.tail) {
            System.out.println("Actualmente en último nodo, no se puede avanzar");
            return false;
        }
        this.current = this.current.getNext();
        this.position++;
        return true;
    }

    public boolean previous() {
        if (this.current == this.head) {
            System.out.println("Actualmente en primer nodo, no se puede retroceder");
            return false;
        }
        NodeConsultorio temp = head;
        this.position = -1;
        while (temp.getNext() != this.current) {
            temp = temp.getNext();
            this.position++;
        }
        this.current = temp;
        return true;
    }

    public int getPosition() {
        return this.position;
    }

    public void goToStart(){
        this.current = this.head;
        this.position = -1;
    }

    public void goToEnd(){
        this.current = this.tail;
        this.position = this.size - 1;
    }

    //En el siguiente metodo, se usa una posicion especifica para obtener un elemento de la lista
    public Object goToPos(int pos) {
        if (pos < 0 || pos >= this.size) {
            System.out.println("Posición inválida");
            return null;
        }
        int temp = 0;
        current = head.getNext();
        while (temp != pos){
            current = current.getNext();
            temp++;
        }
        return current.getElement();
    }

    public NodeConsultorio getHead() {
        return head;
    }
}