
// Name
// Age
// Percentage

// From user and print:

// Student Report
// --------------
// Name: Rahul
// Age: 20
// Percentage: 85.5

package src.lecture_2.practice;

import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.next();
        System.out.println("enter your age");
        int age=sc.nextInt();
        System.err.println("enter your persentage");
        double persentage=sc.nextDouble();
        System.out.println("student report ");
        System.out.println("---------------------------------");
        System.out.println("name"+name);
        System.out.println("age"+age);
        System.out.println("persentage"+persentage);
        sc.close();
        
    }
}
