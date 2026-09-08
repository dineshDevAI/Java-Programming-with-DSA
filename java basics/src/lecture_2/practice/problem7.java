package src.lecture_2.practice;

import java.util.Scanner;

public class problem7 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first no");
        int a=sc.nextInt();
        System.out.println("enter second no");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("the addition of this two number is"+c);
        sc.close();
    }
    
}
