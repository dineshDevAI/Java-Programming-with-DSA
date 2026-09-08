//variables
package src.lecture_2.practice;

import java.util.Scanner;

public class problem2 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("plesae enter your name");
        String name =sc.next();
        
        System.out.println("hello "+name);
        System.out.println("enter your age");
        int age=sc.nextInt();
    System.out.println("your age is "+age);
    System.out.println("please enter your percentage");
    double per=sc.nextDouble();
    System.out.println("your percentage is "+per);
    sc.close();
    }
}