package src.lecture_1.practice;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter first number");
    int a=sc.nextInt();
    System.out.println("enter second number ");
    int b=sc.nextInt();
    System.out.println("enter third number");
    int c=sc.nextInt();
    if(a>b){
        System.out.println("a is greater");
    }if (a<b) {
        System.out.println("b is greater");
        
    } else {
        System.out.println("c is greater"+c);
        
    }
    sc.close();    
    }
    
    
}
