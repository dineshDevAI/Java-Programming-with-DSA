package src.lecture_5.pattern;

import java.util.Scanner;


public class problem7 {
    public static int cal(int a,int b){
        int sum=a*b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no");
        int  a =sc. nextInt();
        System.out.println("enter second no");
        int b=sc.nextInt();     
        int sum=cal(a, b);
        System.out.println(sum);
        sc.close();
    }
}
