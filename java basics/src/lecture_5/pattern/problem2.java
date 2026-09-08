// hollow rectangle
// *****
// *   *
// *   *
// *****

package src.lecture_5.pattern;

import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first no");
        int n = sc.nextInt();
        System.out.println("enter second no");
        int m =sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || j==1 ||i==n ||j==m ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        sc.close();
    }
}