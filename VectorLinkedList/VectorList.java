package VectorLinkedList;

public class VectorList {
    private List start;
    public VectorList(List s){
        start = s;
    }

    public List getStart(){
        return start;
    }

    public void setStart(List s){
        start = s;
    }

    public void appendVector(){

    }

    public List getIndexedVector(int in){
        List next = start.getNext();
        // Looping through the linked list
        while (next != null){
            // If index is found return
            if (next.getIndex() == in){
                return next;
            }
            // Else, move to the next item
            next = next.getNext();
        }
        // Returns null if not found
        return null;
    }
}