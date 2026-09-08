// Mini Project
// ATM Menu

// Display:

// 1. Check Balance
// 2. Deposit
// 3. Withdraw
// 4. Exit

// Use switch.

// Example:

// Enter Choice: 1

// Current Balance = 5000

package src.lecture_5.pattern;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        System.out.println("======WEL-COME USERS=========");
        Scanner sc = new Scanner(System.in);
        int pin=1234;
        System.out.println("Enter your pin");
        int enterpin=sc.nextInt();
        if(enterpin==pin){
        System.out.println("enter your name");
        String name =sc.next();
        System.out.println(" Hello "+name+"!");
        System.out.println("1.Check balance");
        System.out.println("2.withdraw");
        System.out.println("3.deposite");
        System.out.println("4.exit");
        System.out.println("Enter your choise");
        int ch=sc.nextInt();
        
        double balance=10000;
        System.out.println("enter amonut to deposite");
        double amonut=sc.nextDouble();
        balance +=amonut;
        System.out.println("Amount deposite successfilly");
        System.out.println("current amount "+balance);
        
        switch (ch) {
            case 1:
                System.out.println("current balance is =50000"); 
                break;
            case 2:
               System.out.println("Enter amount");
               int amount=sc.nextInt();
               if(balance<=amonut){
                balance-=amount;
                System.out.println("remaing balance");
               }else{
                System.out.println("Insufficient balalance");
               }
                break;
            case 3:
                System.out.println("The amount Deposited Successfully..!");
            break;
            case 4:
                System.out.println("thank you ");  
                break;         
        
            default:
                System.out.println("invalid choise");
                break;
        }
        
        sc.close();
    }  
}
}
