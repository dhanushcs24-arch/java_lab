abstract class Shape{
    double a , b;

    Shape(double a , double b){
        this.a = a;
        this.b = b;
    }

    abstract void getArea();
}

class Rectangle extends Shape{
    Rectangle(double a , double b){
        super(a, b);
    }

    @Override
    void getArea(){
        double area  =a*b;
        System.out.println("Area of Rectangle is : " + area);
    }
}

class Triangle extends Shape{
    Triangle(double a , double b){
        super(a,b);
    }

    @Override 
    void getArea(){
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle : " + area);
    }
}

class Circle extends Shape{
    Circle(double radius){
        super(radius,0);
    }

    @Override
    void getArea(){
        double area = Math.PI * a * a;
        System.out.println("Area of Circle : " + area);
    }
}

public class Lab4{
    public static void main(String[] args) {
        Shape r = new Rectangle(4,5);
        Shape t = new Triangle(4,5);
        Shape c = new Circle(4);

        r.getArea();
        t.getArea();
        c.getArea();
    }
}
