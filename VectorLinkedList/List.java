package VectorLinkedList;

public class List {
    static private int currentIndex = 1;
    private int index;
    private List previous, next;
    private Vector vec;

    // Append mode
    public List(List p, int x, int y, int z){
        vec = new Vector(x,y,z);
        previous = p;
        index = currentIndex;
        currentIndex++;
        next = null;
    }

    // Insert mode
    public List(List p, List n, int x, int y, int z){
        vec = new Vector(x,y,z);
        previous = p;
        next = n;
        index = currentIndex;
        currentIndex++;
    }

    // Setters/getters
    public int getIndex(){
        return index;
    }

    public void setIndex(int i){
        index = i;
    }

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