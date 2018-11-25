package sortingstudent;
import java.util.*;
public class SortingStudentByGPA implements Comparator <Student> {

   static Student [] students = new Student [3];
    void  quickSort (Student [] students, int low, int high) {
    
    if (students.length == 0)
        return;
    if (low >= high) 
        return;
    int middle = students.length / 2;
    Student st = students [middle];
    int i = low, j = high;
        while (i <= j) {
            while ((compare (students [i], st)) == 1) {
                i++;
            }
 
            while ((compare (st,students [j])) == 1) {
                j--;
            }
 
            if (i <= j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
        }
 
        
        if (low < j)
            quickSort(students, low, j);
 
        if (high > i)
            quickSort(students, i, high);
    
    
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < students.length; i ++) {
            System.out.println ("Enter Student's name and score:\n");
            students[i] = new Student();
            students [i].setName(in.next());
            students [i].setScore(in.nextInt());
        }
        for (Student s: students){
            System.out.println (s.getName() + " " + s.getScore());
        }
        SortingStudentByGPA gpa = new SortingStudentByGPA();
        gpa.quickSort(students, 0, students.length - 1);
        for (Student s: students){
            System.out.println (s.getName() + " " + s.getScore());
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getScore() > o2.getScore()) return 1;
        else if (o1.getScore() < o2.getScore()) return -1;
        else return 0;
    }
    
}