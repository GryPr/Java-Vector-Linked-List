package VectorLinkedList;

public class List {
    private List previous, next;
    private Vector vec;

    // Append mode
    public List(List p, Vector v){
        vec = v;
        previous = p;
    }

    // Insert mode
    public List(List p, List n, Vector v){
        vec = v;
        previous = p;
        next = n;
    }

    // Setters/getters
    public List getPrevious(){
        return previous;
    }

    public List getNext(){
        return next;
    }

    public Vector getVector(){
        return vec;
    }

    public void setPrevious(List p){
        previous = p;
    }

    public void setNext(List n){
        next = n;
    }

    public void setVector(Vector v){
        vec = v;
    }
}