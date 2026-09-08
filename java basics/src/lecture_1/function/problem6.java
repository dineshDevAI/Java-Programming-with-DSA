package src.lecture_1.function;

public class problem6 {
    int cal(int a,int b){
        return(a+b);
    }
    int mul(int a,int b){
        return(a*b);
    }
    int div(int a ,int b){
        return(a/b);
    }
    public static void main(String[] args) {
        problem6 d=new problem6();
        int result1=d.cal(10, 20);
        int result2=d.mul(2, 40);
        int result3=d.div(10, 2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
