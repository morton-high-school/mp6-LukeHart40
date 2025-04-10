public class Node{
    private int value;
    private Node next = null;

    public Node(){
        this.value = -1;
    }
    
    public Node(int value){
        this.value = value;
    }

    public int getData(){
        return value;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    punlic void setValue(int number){
        this.value = number;
    }
}