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
public class QueueConsultorios {
    private NodeConsultorio front;
    private NodeConsultorio rear;
    private int size;
    private static QueueConsultorios consVerdes;
    private static QueueConsultorios consRojos;
    private static QueueConsultorios consAmarillos;
    private static QueueConsultorios consEgresos;

    public QueueConsultorios(){
        this.front = new NodeConsultorio();
        this.rear = this.front;
        this.size = 0;
    }
    
    //Patron singleton
    public static QueueConsultorios getConsRojos() {
       if(consRojos == null) {
          consRojos = new QueueConsultorios();
       }
       return consRojos;
    }
    
    public static QueueConsultorios getConsVerdes() {
       if(consVerdes == null) {
          consVerdes = new QueueConsultorios();
       }
       return consVerdes;
    }
    
    public static QueueConsultorios getConsAmarillos() {
       if(consAmarillos == null) {
          consAmarillos = new QueueConsultorios();
       }
       return consAmarillos;
    }
    
    public static QueueConsultorios getConsEgresos(){
        if(consEgresos==null){
            consEgresos=new QueueConsultorios();
        }
        return consEgresos;
    }
    
    public void enqueue(Consultorio element){
        this.rear.setNext(new NodeConsultorio(element, null));
        this.rear = rear.getNext();
        this.size++;
    }

    public Consultorio dequeue(){
        if(this.size == 0){
            System.out.println("Queue is empty");
            return null;
        }
        Consultorio temp = this.front.getNext().getElement();
        NodeConsultorio nTemp = this.front.getNext();
        this.front.setNext(nTemp.getNext());
        if (this.rear == nTemp){
            this.rear = this.front;
        }
        this.size--;
        return temp;
    }

    public Object first(){
        if(this.size == 0){
            System.out.println("Queue is empty");
            return null;
        }
        return this.front.getNext().getElement();
    }

    public int size(){
        return this.size;
    }

    public void clear(){
        this.front = new NodeConsultorio();
        this.rear = this.front;
        this.size = 0;
    }

    public String toString(){
        String result = "**LQueue**\n";
        NodeConsultorio tFront = this.front;
        int tSize = this.size;
        while(tSize != 0){
            result+= tFront.getNext().getElement() + " ";
            tFront = tFront.getNext();
            tSize--;
        }
        return result;
    }

    public void rotate(){
        if (this.size == 0) {
            System.out.println("Queue is empty");
        } else {
            NodeConsultorio current = this.front.getNext();
            NodeConsultorio temp = null;
            NodeConsultorio newRear = null;
            while (current != null) {
                if (current == this.front.getNext()){
                    temp = new NodeConsultorio(current.getElement(), null);
                    newRear = temp;
                } else if (current == this.rear) {
                    temp = new NodeConsultorio(current.getElement(), temp);
                    this.front.setNext(temp);
                } else {
                    temp = new NodeConsultorio(current.getElement(), temp);
                }
                current = current.getNext();
            }
            this.rear = newRear;
        }
    }

    public void rotate2(){
        if (this.size == 0) {
            System.out.println("Queue is empty");
        } else {
            NodeConsultorio next = this.front.getNext();
            NodeConsultorio afterNext = next.getNext();
            NodeConsultorio temp = null;

            while (afterNext != null) {
                if (next == this.front.getNext()){
                    next.setNext(null);
                    this.front.setNext(this.rear);
                    this.rear = next;
                }
                temp =  afterNext.getNext();
                afterNext.setNext(next);
                next = afterNext;
                afterNext = temp;
            }

        }
    }

    public NodeConsultorio getFront() {
        return front;
    }

    public void setFront(NodeConsultorio front) {
        this.front = front;
    }

    public NodeConsultorio getRear() {
        return rear;
    }

    public void setRear(NodeConsultorio rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}