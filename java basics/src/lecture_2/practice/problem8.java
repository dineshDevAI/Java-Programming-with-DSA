
//Take length and width from user and calculate area of rectangle.
// Formula:
// Area = length × width

package src.lecture_2.practice;

import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of rectangle");
        int len=sc.nextInt();
        System.out.println("enter width of rectangle");
        int wid=sc.nextInt();
        int area=len*wid;
        System.out.println("the area of rectangle is :"+area);
        sc.close();
    }
    
}
