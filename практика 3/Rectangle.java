package shapes;
public class Rectangle extends Shape {
    protected double width;
    protected double length;
    Rectangle() {
        width = 1.0;
        length = 1.5;
        color = "GREEN";
        filled = false;
    }
    Rectangle (double width, double length) {
        this.width = width;
        this.length = length;
        color = "BLUE";
        filled = false;
    }
    Rectangle (double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth () {
        return width;
    }
    public void setWidth (double width) {
        this.width = width;
    }
    public double getLength () {
        return length;
    }
    public void setLength (double length) {
        this.length = length;
    }
    public double getArea() {
        
        return width*length;
    }

    public double getPerimetr() {
        return 2*(width + length);
    }
    public String toString() {
        return "Shape: rectangle, color: " + this.color + ", width: " + this.width + ", length: " + this.length;
    }
    
}
