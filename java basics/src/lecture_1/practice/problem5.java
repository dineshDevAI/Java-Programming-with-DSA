//Create a class Calculator.
package src.lecture_1.practice;
public class problem5 {
    int add(int a,int b){
        return(a+b);
    }
    int sub(int a,int b){
        return(a-b);
    }
    int mul(int a,int b){
        return(a*b);

    }
    int div(int a,int b){
        return(a/b);
    }
    public static void main(String[] args) {
        problem5 d=new problem5();
       int e= d.add(10, 30);
        int c=d.sub(10, 5);
        int b=d.mul(10, 30);
        int a=d.div(10, 5);
        System.out.println(e);
        System.out.println(c);
System.out.println(b);
System.out.println(a);
    }
}