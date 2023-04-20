package OOP2.abstracvainterface.baitap;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed,int ySpeed,int radius){
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + "radius: " + this.radius;
    }
    public void  moveUp(){}
    public void moveDown(){}
    public void moveLeft(){}
    public void moveRight(){}
}
