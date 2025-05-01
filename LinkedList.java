public class LinkedList{
    private boolean condition;
    private Node list;

    public LinkedList(){
        list = new Node();
        this.condition = false;
    }

    public Node getFront(){
        return list;
    }

    public void append(Node node){
        Node original = node;
        int stop = -1;
        while(stop != 0){
            Node temp = list;
            if(temp.getNext() == null){
                temp.setNext(original);
                stop = 0;
            }else{
                temp = temp.getNext();
            }
        }
    }

    public void insert(Node node, int index){
        Node original = node;
        int stop = -1;
        int count = 0;
        while(stop != 0){
            Node temp = list;
            if(list.getNext() == null){
                list.setNext(original);
                stop = 0;
            }else if(count == index - 1){
                list.setNext(original);
                stop = 0;
            }else{
                temp = temp.getNext();
                count++;
            }
        }
    }

    public Node remove(int index){
        int stop = -1;
        return list;
    }

    public String toString(){
        int stop = -1;
        int index = -1;
        Node temp = list;
        if(condition == false){
            return ("There are no items in this list.");
        }
        while(stop != 0){
            if(temp.getNext() == null){
                stop = 0;
            }
            index++;
            return("Index: " + index + " Data: " + temp.getData() + "\n");
            temp = temp.getNext();
        }
    }
}