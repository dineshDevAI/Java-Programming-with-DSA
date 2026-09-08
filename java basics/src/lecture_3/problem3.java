//create a calculator with swith case 
// this calculator is to be perform addtion substraction multiplication and the divsion
//enter first no
//enter second no
//enter your choise
//display the result
package src.lecture_3;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first no");
        int a=sc.nextInt();
        System.out.println("enter second no");
        int b=sc.nextInt();
        System.out.println("enter your choise");
        System.out.println("1 addition");
        System.out.println("2 substraction");
        System.out.println("3 multiplication");
        System.out.println("4 division");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("the addition of this two no is:"+ (a+b));
            break;
            case 2:
                System.out.println("the substraction of this two no is "+(a-b));
            break;
            case 3:
                System.out.println("the multiplication of this two number is "+(a*b));
            break;
            case 4:
                System.out.println("the division of this two number is to be"+(a/b));
            case 5:
                System.out.println("the module of this no is "+(a%b));
            break;
            case 6:
                System.out.println("the addtion of this two no is"+(a%b));
        
            default:
                System.out.println("invalid choise");
                break;
        }
        sc.close();
    }
}
