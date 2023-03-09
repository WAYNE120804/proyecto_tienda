package co.edu.umanizales.tads.model;

import lombok.Data;

@Data
public class ListSE {
    private Node head;

    /*
    algortimo de adicionar al final
    entrada
    un niño si hay datos
    si llamo a un ayudante y le digo qu se posocione ne la cabeza
    mietnras en el brazo exista algo
    pase al siguiente
    va estar en el ultimo

    meto al niño en un costal (nuevo costal>)
    y le diho al ultimo que tome el costal

    no

    metenemos el nilño en el costal y ese costal es la cabeza
     */

    public void add(Kid kid){
        if(head !=null){
            Node temp=head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            //parado en el ultimo
            Node newNode=new Node(kid);
            temp.setNext(newNode);
        }
        else {
            head=new Node(kid);
        }
    }

    /*Adicionar al inicio
    si hay datos
    si
       meto al niño al costal(nuevocostal)
       le digo al nuevo costal que tome con su brazo a la cabeza
       cabeza es iguala nuevo costal
    no
        meto al niño es un costal y los asigno a la cabeza
     */
    public void addToStart(Kid kid){
        if(head!=null){
            Node newNode=new Node(kid);
            newNode.setNext(head);
            head=newNode;
        }
        else{
            head=new Node(kid);
        }
    }

    /*eliminar costal
    consultar la identificacion del niño, si es el mismo que se dio eliminar ese costal
    y hacer que el nodo del cual estaba tome el costal
    si este era el ultimo costal hacer que el nodo quede vacio

    sino se encuentra el niñoenviar un mensaje de que el niño no se encuentra
     */

    public void deleateKid(String Id){
        Node temp=head;
        while(!temp.getNext().getData().getIdentification().equals(Id))
        {
            temp=temp.getNext();
        }
        temp.getNext().setData(null);
    }

    /*algoritmo de adicionar niño en posicion
    se recibe un niño y una posicion.
    el ayudante debera recorer la listaSE y con un contador ir contado la poscion para
    hasta encontar la poscion dada y con el niño en un costal nuevo meterlo en esa posicion
     */

    public void setKidByPos(Kid kid, int pos){
        Node temp=head;
        int sum=0;
        for(int i=0;i<pos;i++){
            temp=temp.getNext();
        }
        Node newNode=new Node(kid);
        temp.setNext(newNode);
    }

}
