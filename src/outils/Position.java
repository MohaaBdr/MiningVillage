package outils;

public class Position {

    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void deplaceX(int a){
        this.x = this.x + a;
    }

    public void deplaceY(int a){
        this.y = this.y + a;
    }

    public void setX(int a) {
        this.x = a;
    }

    public void setY(int a) {
        this.y = a;
    }
}
