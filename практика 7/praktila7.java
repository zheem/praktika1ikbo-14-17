package practice7;
import java.util.ArrayDeque;
import java.lang.Math;
public class Practice7 {
    
    
    public static void main(String[] args) {
        int count = 0;
       ArrayDeque <Integer> first = new ArrayDeque <Integer> (10);
       ArrayDeque <Integer> second = new ArrayDeque <Integer> (10);
       for (int i =0; i < 5; i++) {
          int rand = 0 + (int) (Math.random() *10);
         first.push (rand);  
       }
           
        for (int i = 0; i < 5; i++) {
            int rand = 0 + (int) (Math.random() *10);
            second.push (rand);
        }
         
           System.out.print (first + "\n");
       
           System.out.print (second + "\n");
       
       while (count < 106 && !(first.isEmpty() || second.isEmpty()) ) {
           count++;
           if (first.getFirst() > second.getFirst() || (first.getFirst() == 0 && second.getFirst() == 9)) {
               first.addLast(first.pollFirst());
               first.addLast (second.pollFirst());
           }
           else if (first.getFirst() < second.getFirst()|| (first.getFirst() == 9 && second.getFirst() == 0)) {
               second.addLast(first.pollFirst());
               second.addLast(second.pollFirst());
           }
           else {
               first.addLast(first.pollFirst());
               second.addLast(second.pollFirst());
           }
           System.out.print (first + "\n");
           System.out.print (second + "\n");
           
    }
       if (first.isEmpty())
           System.out.printf("second %d", count);
       else if (second.isEmpty())
           System.out.printf("first %d", count);
       else if (count == 106) 
           System.out.println ("botva");
  }
} 