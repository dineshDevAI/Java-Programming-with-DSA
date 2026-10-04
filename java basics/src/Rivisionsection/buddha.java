package src.Rivisionsection;

import java.util.Scanner;

/**
 * buddha
 */
public class buddha {

  public static void main(String args[]){
    Scanner sc = new  Scanner(System.in);
    System.out.println("Enter your Pin");
    int pin=sc.nextInt();
    System.err.println("Your pin :"+pin);
    System.out.println("Your name : Dinesh Sonawane ");
    int totalbalance=20000;
    System.out.println("TotalBalance ="+totalbalance);
    System.out.println("Enter your choise");
    System.err.println(" 1 Deposite");
    System.out.println(" 2 Withdrow");
    System.out.println(" 3 Display total balance");
    int ch= sc.nextInt();
    switch (ch) {
      case 1:
        System.out.println("enter your amount");
        int amount=sc.nextInt();
        //amount=totalbalance -amount;
        if (totalbalance > amount) {
          amount=totalbalance -amount;
        }else{
          System.out.println("check your balance");
        }
        break;
      case 2:
        System.out.println("enter withdraw amount");
        int withdraw = sc.nextInt();
        amount=totalbalance+withdraw;
        break;
      case 3:
        System.out.println("your total balance is :"+totalbalance);
      default:
        break;
    }
  }
}
