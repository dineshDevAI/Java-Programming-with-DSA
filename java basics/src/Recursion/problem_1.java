package src.Recursion;

/**
 * problem_1
 */
// Print no from 5 to 1
public class problem_1 {

    public static void printnumb(int n){
        if (n==0) {
            return ;
        }
        System.out.println(n);
        printnumb(n-1);
    }
    public static void main(String args[]){
        int n=5;
        printnumb(n);
    }
}
