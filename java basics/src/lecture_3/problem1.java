package src.lecture_3;

import java.util.Scanner;

public class problem1 {

    public static void main(String[] args) {
    //int age=18;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your age");
    int no=sc.nextInt();
    if (no>=18) {
        System.out.println("you can vote");
    }else{
        System.out.println("you can not vote:");
    }
        sc.close();
    }
}