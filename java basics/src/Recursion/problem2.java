package src.Recursion;
//print number form 1 to 5

public class problem2 {
    public static  void printnumb(int n){
        if (n==6) {
            return ;
        }
        System.out.println(n);
        printnumb(n+1);
    }
    public static void main(String args[]){
        int n=1;
    printnumb(n);
        
    }    
}
