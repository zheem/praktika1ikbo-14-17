package shapes;
public class Circle extends Shape {
protected double radius;
public Circle () {
    radius  = 2.0;
    color = "Green";
    filled = true;
}
Circle (double r, String c, boolean f) {
    radius = r;
    color = c;
    filled = f;
}
Circle (double radius) {
    this.radius = radius;
    color = "BLUE";
    filled = true;
}
public double getRadius(){
    return this.radius;
}
public void setRadius(double radius) {
    this.radius = radius;
}
    @Override
    public double getArea() {
    return Math.PI*radius*radius; 
    }
    @Override
    public double getPerimetr() {
      
    return Math.PI*2*radius;
    
    }
    @Override
    public String toString() {  
    return "Shape: circle, color: " + this.color + ", radius: " + this.radius;
    
    }
    
}