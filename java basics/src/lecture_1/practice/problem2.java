// Create a method that calculates circumference
package src.lecture_1.practice;

public class problem2 {
    double add (double a,double b,double c){
        return (a*b*c);
    }
    public static void main(String[] args) {
        problem2 d=new problem2();
        double result=d.add(2, 3.14, 10);
        System.out.println(result);
    }
}

