package baitaptuan2;

 abstract class Shapes {
    public String color = "red" ;
    public boolean filled = true ;

    public Shapes(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shapes () {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

   public abstract double getArea();

   public abstract double getPerimeter() ;

    public String toString() {
        return "color : " + getColor() + "filled  : "+ isFilled() ;
    }
}

class Circler extends  Shapes {
     public double radius  = 1.0;
     public  Circler(String color , boolean filled,double radius) {
        super(color, filled);
        this.radius = radius ;
     }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
     public double getArea() {
        return radius*radius*Math.PI ;
     }

     public double getPerimeter () {
         return 2 ;
     }

     public String toString(){
         return  "Circle[Shape[Color" + ":" + getColor() + "," + "[filled : " + isFilled() +"[radius : " + getRadius()  ;
     }




}

class Rectangles extends Shapes {
     public double width = 1.0;
     public double height = 1.0 ;

    public Rectangles(String color, boolean filled,double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;

    }

    public Rectangles(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return this.width * this.height ;
    }

    public double getPerimeter () {
        return 4 ;
    }

    public String toString(){
        return  "Rectangle[Shape[Color" + ":" + getColor() + "," + "[filled : " + isFilled() +"[width : " + getWidth() + ",[height : " + getHeight();
    }

}

class Squares extends Rectangles {



    public Squares(double side) {
        super(side,side);
    }


    public void setWidth(double side) {

    }

    public void setHeight(double side) {

    }

    public String toString(){
        return  "toString" ;
    }



}

class TestSquare {
    public static void main(String[] args) {
        Circler circler = new Circler("blue",true,2.0);
        System.out.println(circler.getArea());
        System.out.println(circler.toString());

        System.out.println("---------------------------");

        Rectangles rectangles = new Rectangles("Orange",true,3,4);
        System.out.println(rectangles.getArea());
        System.out.println(rectangles.toString());

        System.out.println("---------------------------");

        Squares squares = new Squares(4);
    }
}
