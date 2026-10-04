package src.Rivisionsection;

import java.util.Scanner;

/**
 * buddha
 */
public class buddha {

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your mark");
    int mark =sc.nextInt();
    if (mark >90) {
      System.err.println("Excellent");
    }else if (mark >80) {
      System.out.println("Vary good");
    }
    else if (mark < 40) {
      System.err.println("Fail");
    }
  }
}
