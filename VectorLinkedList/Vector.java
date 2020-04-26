package VectorLinkedList;
class Vector {
    private int x,y,z;
    public Vector(int x1, int y1, int z1){
        x = x1;
        y = y1;
        z = z1;
    }

    // Getters/setters
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getZ(){
        return z;
    }

    public void setX(int x1){
        x = x1;
    }

    public void setY(int y1){
        y = y1;
    }

    public void setZ(int z1){
        z = z1;
    }
}