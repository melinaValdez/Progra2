
package Cola;

public class Queue<T> {
    public Node<T> front;
    public Node<T> rear;
    public int size;
    public Node<T> current;
    public Node<T> temp;
    
    //Constructor.
    public Queue(){
        this.front=new Node<>();
        this.rear=front;
        this.size=0;
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
    public void enqueue(Paciente paciente){
        Node nuevo=new Node(paciente);
        if(this.size==0){
            this.rear.setNext(nuevo);
            this.rear=rear.getNext();
            this.size++;
        }else{
            if(nuevo.getElement().getValoracion()=="[I]"){                
                nuevo.setNext(front.getNext());
                this.front.setNext(nuevo);
                this.size++;
            }
            if(nuevo.getElement().getValoracion()=="[H]"){
                temp=front;
                while(true){
                        if(temp.getNext()==rear){
                            if (rear.getElement().getValoracion()=="[I]"){
                                temp.getNext().setNext(nuevo);
                                rear=rear.getNext();
                                this.size++;
                            }else{
                                temp.setNext(nuevo);
                                nuevo.setNext(rear);
                                this.size++;
                            }
                            break;
                        }else if(temp.getNext().getElement().getValoracion()=="[I]"){
                            temp=temp.getNext();
                        }
                        else{
                            nuevo.setNext(temp.getNext());
                            temp.setNext(nuevo);
                            this.size++;
                            break;
                        }
                }
            }
            if(nuevo.getElement().getValoracion()=="[P]"){
                temp=front;
                while(true){
                        if(temp.getNext()==rear){
                            if (rear.getElement().getValoracion()=="[I]" || rear.getElement().getValoracion()=="[H]"){
                                temp.getNext().setNext(nuevo);
                                rear=rear.getNext();
                                this.size++;
                            }else{
                                temp.setNext(nuevo);
                                nuevo.setNext(rear);
                                this.size++;
                            }
                            break;
                        }else if(temp.getNext().getElement().getValoracion()=="[I]" || temp.getNext().getElement().getValoracion()=="[H]"){
                            temp=temp.getNext();
                        }
                        else{
                            nuevo.setNext(temp.getNext());
                            temp.setNext(nuevo);
                            this.size++;
                            break;
                        }
                }
            }
            if(nuevo.getElement().getValoracion()=="[D]"){
                temp=front;
                while(true){
                        if(temp.getNext()==rear){
                            if (rear.getElement().getValoracion()=="[I]" || rear.getElement().getValoracion()=="[H]" || rear.getElement().getValoracion()=="[P]"){
                                temp.getNext().setNext(nuevo);
                                rear=rear.getNext();
                                this.size++;
                            }else{
                                temp.setNext(nuevo);
                                nuevo.setNext(rear);
                                this.size++;
                            }
                            break;
                        }else if(temp.getNext().getElement().getValoracion()=="[I]" || temp.getNext().getElement().getValoracion()=="[H]" || temp.getNext().getElement().getValoracion()=="[P]"){
                            temp=temp.getNext();
                        }
                        else{
                            nuevo.setNext(temp.getNext());
                            temp.setNext(nuevo);
                            this.size++;
                            break;
                        }
                }
            }
            if(nuevo.getElement().getValoracion()=="[Q]"){
                temp=front;
                while(true){
                        if(temp.getNext()==rear){
                            if (rear.getElement().getValoracion()=="[I]" || rear.getElement().getValoracion()=="[H]" || rear.getElement().getValoracion()=="[p]" || rear.getElement().getValoracion()=="[D]"){
                                temp.getNext().setNext(nuevo);
                                rear=rear.getNext();
                                this.size++;
                            }else{
                                temp.setNext(nuevo);
                                nuevo.setNext(rear);
                                this.size++;
                            }
                            break;
                        }else if(temp.getNext().getElement().getValoracion()=="[I]" || temp.getNext().getElement().getValoracion()=="[H]" || temp.getNext().getElement().getValoracion()=="[P]" || temp.getNext().getElement().getValoracion()=="[D]"){
                            temp=temp.getNext();
                        }
                        else{
                            nuevo.setNext(temp.getNext());
                            temp.setNext(nuevo);
                            this.size++;
                            break;
                        }
                }  
            }
            if(nuevo.getElement().getValoracion()=="[O]"){
                this.rear.setNext(nuevo);
                this.rear=this.rear.getNext();
                this.size++;
            }
        }
    }
    
    //Desencola.
    public void dequeue(){
        this.front.setNext(this.front.getNext().getNext());
    }
    
    //Imprime la cola.
    public String toString(){
        String result="Queue:";
        Node<T> tFront=this.front;
        int tSize=this.size;
        while(tSize!=0){
            result+=tFront.getNext().getElement().getNombre()+" ";
            tFront=tFront.getNext();
            tSize--;
        }
        return result;
        
    }    


    
}
