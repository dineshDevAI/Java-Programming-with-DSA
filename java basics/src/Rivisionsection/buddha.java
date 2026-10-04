package src.Rivisionsection;

import java.util.Scanner;

/**
 * buddha
 */
public class buddha {

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first no");
    int a = sc.nextInt();
    //System.out.println("enter second no");
    //int b = sc.nextInt();
    if (a %2 ==0) {
      System.err.println("True");
    }else{
      System.err.println("False");
    }
    sc.close();
  }
}
