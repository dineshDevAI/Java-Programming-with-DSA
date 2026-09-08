package src.lecture_2.practice;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name =sc.next();
        System.out.println("enter your age");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("enter your collage");
        String collage =sc.nextLine();


        // System.out.println("plesase check your details below");
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("collage="+collage);
        sc.close();

    }
}
