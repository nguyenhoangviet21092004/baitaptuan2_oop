package OOP2.abstracvainterface.baitap;

public interface Movable {
    abstract void moveUp();
    abstract void moveDown();
    abstract void moveLeft();
    abstract void moveRight();
}
class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovablePoint(int x, int y,int xSpeed,int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "X: " + this.x + ",Y: " + this.y + "  speed:" + this.xSpeed + "," + this.ySpeed;
    }
    public void moveUp(){
        y -= ySpeed;
    }
    public void moveDown(){
        y += ySpeed;
    }
    public void moveLeft(){
        x -= xSpeed;
    }
    public void moveRight(){
        x += xSpeed;
    }
}
class testMovePoint{
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        movablePoint.moveDown();
        System.out.println(movablePoint);
    }
}