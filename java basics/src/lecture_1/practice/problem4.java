//Create a method isEven().
package src.lecture_1.practice;
import java.util.Scanner;
public class problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("true");

        }else{
            System.out.println("false");
        }
        sc.close();
    }
}
