package co.edu.umanizales.tads.model;


import lombok.Data;

@Data

public class Node {
    private Kid data;
    private Node next;
    public Node(Kid kid){
        this.data=data;
    }
}
