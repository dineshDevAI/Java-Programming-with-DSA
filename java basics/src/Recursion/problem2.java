package src.Recursion;
//print number form 1 to 5

public class problem2 {
    public static  void printnumb(int n){
        if (n==0) {
            return ;
        }
        System.out.println(n);
        printnumb(n);
    }
    public static void main(String args[]){
        int n=5;
    printnumb(n);
        
    }    
}
