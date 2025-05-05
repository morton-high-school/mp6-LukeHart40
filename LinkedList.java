public class LinkedList{
    private Node list;

    public LinkedList(){
        list = new Node();
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
        Node temp = list;
        while(stop != 0){
            if(temp.getNext() == null){
                list.setNext(original);
                stop = 0;
            }else if(count == index - 1){
                temp.setNext(original);
                stop = 0;
            }else{
                temp = temp.getNext();
                count++;
            }
        }
    }

    public Node remove(int index){
        int stop = -1;
        int count = 0;
        Node temp = list;
        Node returned = null;
        while(stop != 0){
            if(temp.getNext() == null){
                stop = 0;
            }else if(count + 1 == index){
                temp.setNext(temp.getNext());
                returned = temp.getNext();
            }else{
                temp = temp.getNext();
                count++;
            }
        }
        return returned;
    }

    public String toString(){
        int stop = -1;
        int index = 0;
        Node temp = list;
        String values = "";
        if(temp == null){
            values = ("There are no items in this list.");
        }
        while(stop != 0){
            temp = temp.getNext();
            if(temp == null){
                stop = 0;
            }
            values += ("Index: " + index + " Data: " + temp.getData() + "\n");
            index++;
        }
        return values;
    }
}