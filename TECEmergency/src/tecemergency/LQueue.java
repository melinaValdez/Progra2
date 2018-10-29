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
public class LQueue {

    private Node front;
    private Node rear;
    private int size;

    public LQueue() {
        this.front = new Node();
        this.rear = this.front;
        this.size = 0;
    }

    /*Encola paciente segun el padecimiento que tenga.
    Orden de prioridad:
        [I]=Infarto
        [H]=Perdida de sangre por herida
        [P]=Parto
        [D]=Dolor
        [Q]Quebradura
        [O]=Otro
     */
    public void enqueue(Paciente paciente) {
        Node nuevo = new Node(paciente);
        if (this.size == 0) {
            this.rear.setNext(nuevo);
            this.rear = rear.getNext();
            this.size++;
        } else {
            Node temp;
            if (nuevo.getElement().getEnfermedad().getCodigo() == 'I') {
                temp = front;
                while (true) {
                    if (temp.getNext() == rear) {
                        if (rear.getElement().getEnfermedad().getCodigo() == 'I') {
                            temp.getNext().setNext(nuevo);
                            rear = rear.getNext();
                            this.size++;
                        } else {
                            temp.setNext(nuevo);
                            nuevo.setNext(rear);
                            this.size++;
                        }
                        break;
                    } else if (temp.getNext().getElement().getEnfermedad().getCodigo() == 'I') {
                        temp = temp.getNext();
                    } else {

                        nuevo.setNext(temp.getNext());
                        temp.setNext(nuevo);
                        this.size++;
                        break;
                    }
                }
            }
            if (nuevo.getElement().getEnfermedad().getCodigo() == 'H') {
                temp = front;
                while (true) {
                    if (temp.getNext() == rear) {
                        if (rear.getElement().getEnfermedad().getCodigo() == 'I' || rear.getElement().getEnfermedad().getCodigo() == 'H') {
                            temp.getNext().setNext(nuevo);
                            rear = rear.getNext();
                            this.size++;
                        } else {
                            temp.setNext(nuevo);
                            nuevo.setNext(rear);
                            this.size++;
                        }
                        break;
                    } else if (temp.getNext().getElement().getEnfermedad().getCodigo() == 'I' || temp.getNext().getElement().getEnfermedad().getCodigo() == 'H') {
                        temp = temp.getNext();
                    } else {

                        nuevo.setNext(temp.getNext());
                        temp.setNext(nuevo);
                        this.size++;
                        break;
                    }
                }
            }
            if (nuevo.getElement().getEnfermedad().getCodigo() == 'P') {
                temp = front;
                while (true) {
                    if (temp.getNext() == rear) {
                        if (rear.getElement().getEnfermedad().getCodigo() == 'I' || rear.getElement().getEnfermedad().getCodigo() == 'H' || rear.getElement().getEnfermedad().getCodigo() == 'P') {
                            temp.getNext().setNext(nuevo);
                            rear = rear.getNext();
                            this.size++;
                        } else {
                            temp.setNext(nuevo);
                            nuevo.setNext(rear);
                            this.size++;
                        }
                        break;
                    } else if (temp.getNext().getElement().getEnfermedad().getCodigo() == 'I' || temp.getNext().getElement().getEnfermedad().getCodigo() == 'H' || temp.getNext().getElement().getEnfermedad().getCodigo() == 'P') {
                        temp = temp.getNext();
                    } else {
                        nuevo.setNext(temp.getNext());
                        temp.setNext(nuevo);
                        this.size++;
                        break;
                    }
                }
            }
            if (nuevo.getElement().getEnfermedad().getCodigo() == 'D') {
                temp = front;
                while (true) {
                    if (temp.getNext() == rear) {
                        if (rear.getElement().getEnfermedad().getCodigo() == 'I' || rear.getElement().getEnfermedad().getCodigo() == 'H' || rear.getElement().getEnfermedad().getCodigo() == 'P' || rear.getElement().getEnfermedad().getCodigo() == 'D') {
                            temp.getNext().setNext(nuevo);
                            rear = rear.getNext();
                            this.size++;
                        } else {
                            temp.setNext(nuevo);
                            nuevo.setNext(rear);
                            this.size++;
                        }
                        break;
                    } else if (temp.getNext().getElement().getEnfermedad().getCodigo() == 'I' || temp.getNext().getElement().getEnfermedad().getCodigo() == 'H' || temp.getNext().getElement().getEnfermedad().getCodigo() == 'P' || temp.getNext().getElement().getEnfermedad().getCodigo() == 'D') {
                        temp = temp.getNext();
                    } else {
                        nuevo.setNext(temp.getNext());
                        temp.setNext(nuevo);
                        this.size++;
                        break;
                    }
                }
            }
            if (nuevo.getElement().getEnfermedad().getCodigo() == 'Q') {
                temp = front;
                while (true) {
                    if (temp.getNext() == rear) {
                        if (rear.getElement().getEnfermedad().getCodigo() == 'I' || rear.getElement().getEnfermedad().getCodigo() == 'H' || rear.getElement().getEnfermedad().getCodigo() == 'P' || rear.getElement().getEnfermedad().getCodigo() == 'D' || rear.getElement().getEnfermedad().getCodigo() == 'Q') {
                            temp.getNext().setNext(nuevo);
                            rear = rear.getNext();
                            this.size++;
                        } else {
                            temp.setNext(nuevo);
                            nuevo.setNext(rear);
                            this.size++;
                        }
                        break;
                    } else if (temp.getNext().getElement().getEnfermedad().getCodigo() == 'I' || temp.getNext().getElement().getEnfermedad().getCodigo() == 'H' || temp.getNext().getElement().getEnfermedad().getCodigo() == 'P' || temp.getNext().getElement().getEnfermedad().getCodigo() == 'D' || temp.getNext().getElement().getEnfermedad().getCodigo() == 'Q') {
                        temp = temp.getNext();
                    } else {
                        nuevo.setNext(temp.getNext());
                        temp.setNext(nuevo);
                        this.size++;
                        break;
                    }
                }
            }
            if (nuevo.getElement().getEnfermedad().getCodigo() == 'O') {
                temp = front;
                while (true) {
                    if (temp.getNext() == rear) {
                        if (rear.getElement().getEnfermedad().getCodigo() == 'I' || rear.getElement().getEnfermedad().getCodigo() == 'H' || rear.getElement().getEnfermedad().getCodigo() == 'P' || rear.getElement().getEnfermedad().getCodigo() == 'D' || rear.getElement().getEnfermedad().getCodigo() == 'Q' || rear.getElement().getEnfermedad().getCodigo() == 'O') {
                            temp.getNext().setNext(nuevo);
                            rear = rear.getNext();
                            this.size++;
                        } else {
                            temp.setNext(nuevo);
                            nuevo.setNext(rear);
                            this.size++;
                        }
                        break;
                    } else if (temp.getNext().getElement().getEnfermedad().getCodigo() == 'I' || temp.getNext().getElement().getEnfermedad().getCodigo() == 'H' || temp.getNext().getElement().getEnfermedad().getCodigo() == 'P' || temp.getNext().getElement().getEnfermedad().getCodigo() == 'D' || temp.getNext().getElement().getEnfermedad().getCodigo() == 'Q' || temp.getNext().getElement().getEnfermedad().getCodigo() == 'O') {
                        temp = temp.getNext();
                    } else {
                        nuevo.setNext(temp.getNext());
                        temp.setNext(nuevo);
                        this.size++;
                        break;
                    }
                }
            }
        }
    }

    public Paciente dequeue() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        Paciente temp = this.front.getNext().getElement();
        Node nTemp = this.front.getNext();
        this.front.setNext(nTemp.getNext());
        if (this.rear == nTemp) {
            this.rear = this.front;
        }
        this.size--;
        return temp;
    }

    public Object first() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
            return null;
        }
        return this.front.getNext().getElement();
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        this.front = new Node();
        this.rear = this.front;
        this.size = 0;
    }

    public void rotate() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
        } else {
            Node current = this.front.getNext();
            Node temp = null;
            Node newRear = null;
            while (current != null) {
                if (current == this.front.getNext()) {
                    temp = new Node(current.getElement(), null);
                    newRear = temp;
                } else if (current == this.rear) {
                    temp = new Node(current.getElement(), temp);
                    this.front.setNext(temp);
                } else {
                    temp = new Node(current.getElement(), temp);
                }
                current = current.getNext();
            }
            this.rear = newRear;
        }
    }

    public void rotate2() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
        } else {
            Node next = this.front.getNext();
            Node afterNext = next.getNext();
            Node temp = null;

            while (afterNext != null) {
                if (next == this.front.getNext()) {
                    next.setNext(null);
                    this.front.setNext(this.rear);
                    this.rear = next;
                }
                temp = afterNext.getNext();
                afterNext.setNext(next);
                next = afterNext;
                afterNext = temp;
            }

        }
    }

    public Node getFront() {
        return front;
    }

    public void setFront(Node front) {
        this.front = front;
    }

    public Node getRear() {
        return rear;
    }

    public void setRear(Node rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
