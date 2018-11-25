/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;
public class Square extends Rectangle {
   Square () {
       width = 1;
       length = width;
       color = "GREEN";
       filled = true;
   } 
   Square ( double side) {
       width = side;
       length = width;
       color = "RED";
       filled = true;
   }
   Square (double side, String color, boolean filled) {
       width = side;
       length = width;
       this.color = color;
       this.filled = filled;
   }
   public double getSide () {
       return width;
   }
   public void setSide (double side) {
       width = side;
       length = width;
   }
   @Override
   public void setWidth (double side) {
       setSide(side);
   }
   @Override
   public void setLength (double side) {
       setSide (side);
   }
   @Override
   public String toString() {
       return "Shape: square, color: " + this.color +", side: " + this.width; 
    }
}