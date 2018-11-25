package shapes;
import java.math.*;
abstract class Shape {
    protected String color;
    protected boolean filled;
    
    Shape () {
        color = "GREEN";
        filled = true;
    }
    Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor () {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled (boolean filled) {
        this.filled = filled;
    }
    abstract public double getArea();
    abstract public double getPerimetr();
    abstract public String toString();
}

public class Shapes {
    public static void main(String[] args) {
        Shape s1 = new Circle(10, "BLUE", true);
        System.out.println(s1);
        System.out.println ("Area: " + s1.getArea());
        System.out.println ("Perimetr: " + s1.getPerimetr());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        

Circle c1 = (Circle)s1; 
System.out.println(c1);
System.out.println(c1.getArea());
System.out.println(c1.getPerimetr());
System.out.println(c1.getColor());
System.out.println(c1.isFilled());
System.out.println(c1.getRadius());



Shape s3 = new Rectangle(1.0, 2.0, "GREEN", false); 
System.out.println(s3);
System.out.println(s3.getArea());
System.out.println(s3.getPerimetr());
System.out.println(s3.getColor());

Rectangle r1 = (Rectangle)s3; 
System.out.println(r1);
System.out.println(r1.getArea());
System.out.println(r1.getColor());
System.out.println(r1.getLength());

Square s4 = new Square(6.6); 
System.out.println(s4);
System.out.println(s4.getArea());
System.out.println(s4.getColor());
System.out.println(s4.getSide());
    
    }
    
}