public class LinkedList{
    private boolean condition;

    public LinkedList(){
        Node list = new Node();
        this.condition = false;
    }

    public Node getFront(){
        return
    }

    public void Node append(Node node){
        if(list.getValue() >= 0){
            list.setNext(node);
        }else{
            list.setValue(node.getValue());
            this.condition = true;
        }
    }

    public String toString(){
        if(condition == false){
            return "There are no items in this list.";
        }else(condition){
            while()
        }
    }
}