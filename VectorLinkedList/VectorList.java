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

    public List createVector(List p, int x, int y, int z){
        List veclist = new List(p, x, y, z);
        return veclist;
    }

    public void insertVectorByIndex(int index, int indexNext, int x, int y, int z){
    }

    public void appendVector(int x, int y, int z){
        List endVector = getEndVector();
        createVector(endVector, x, y, z);
    }

    public void removeLastVector(){
        List last = getEndVector();
        List beforeLast = last.getPrevious();
        beforeLast.setNext(null);
        beforeLast.setCurrentIndex(beforeLast.getCurrentIndex()-1);
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

    public List getEndVector(){
        List next = start;
        // Looping through the linked list
        while (next != null){
            next = next.getNext();
        }
        return next;
    }
}