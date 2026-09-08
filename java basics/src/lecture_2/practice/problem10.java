// Take a radius as input and calculate area of circle.

// Formula:

// Area = 3.14 × r × r

package src.lecture_2.practice;

import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        double r=sc.nextDouble();
        double area=3.14*r;
        System.out.println("the radius of circle is "+area);
        sc.close();
    }
}
