package src.lecture_1.practice;
public class problem7 {
    String name;
    int salary;
    
    void display(){
        System.out.println("name: "+name);
        System.out.println("salary: "+salary);
    }
    public static void main(String args[]){
        problem7 d=new problem7();
        d.name="onkar";
        d.salary=10000;
        d.display();
    }
}