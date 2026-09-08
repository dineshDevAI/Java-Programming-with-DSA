// Input:

// Name
// Age
// Course
// Percentage

package src.lecture_2.miniproject;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.next();
        System.out.println("enter your age");
        int age=sc.nextInt();
        System.out.println("enter your course");
        String course=sc.next();
        System.err.println("enter your persentage");
        double persentage=sc.nextDouble();
        System.out.println("student report ");
        System.out.println("---------------------------------");
        System.out.println("name"+name);
        System.out.println("age"+age);
        System.out.println("course"+course);
        System.out.println("persentage"+persentage);
        sc.close();
        
    }
}
    