package VectorLinkedList;

public class List {
    List previous, next;
    Vector vec;
    public List(List p, List n, Vector v){
        vec = v;
        previous = p;
        next = n;
    }
}