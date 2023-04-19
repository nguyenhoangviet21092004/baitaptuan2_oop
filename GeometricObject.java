package baitaptuan2;

interface GeometricObject {
    double getArea();

    double getPerimeter();
}

 class Ciclee implements GeometricObject {

    public  double radius ;

     public Ciclee(double radius) {
         this.radius = radius;
     }

     public double getRadius() {
         return radius;
     }

     public void setRadius(double radius) {
         this.radius = radius;
     }

     public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public String toString() {
         return "Circle[radius : " + getRadius() ;
    }

}

class Rectanglee implements GeometricObject {

    public double width ;
    public double height;

    public Rectanglee(double width, double height) {
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

    public double getArea(){
        return this.height * this.width;
    }

    public double getPerimeter(){
        return (this.height + this.width)*2;
    }

    public String toString() {
        return "Rectangle[width : " + getWidth() + ",[height" + getHeight();
    }

}

class TestGeo{
    public static void main(String[] args) {
       Ciclee ciclee = new Ciclee(2);
        System.out.println(ciclee.getArea());
        System.out.println(ciclee.getPerimeter());
        System.out.println(ciclee.toString());

        System.out.println("--------------");

        Rectanglee rectanglee = new Rectanglee(3,4);
        System.out.println(rectanglee.getArea());
        System.out.println(rectanglee.getPerimeter());
        System.out.println(rectanglee.toString());
    }
}

