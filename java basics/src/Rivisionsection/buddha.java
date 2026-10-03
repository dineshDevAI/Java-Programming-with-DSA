package src.Rivisionsection;

/**
 * buddha
 */
public class buddha {

  int add(int a,int b){
    return a+b;
  }
  int sub(int a,int b){
    return  a-b;

  }
  int multi(int a, int b){
    return a*b;

  }
  int div(int a,int b){
    return a /b;
  }
  public static void main(String args[]){
    buddha s = new buddha();
    System.out.println("addition "+s.add(10, 20));
    System.out.println("substraction"+s.sub(30, 20));
    System.out.println("multiplication"+s.multi(10, 20));
    System.out.println("division "+s.div(10, 2));
    // System.out.println("addition "+s.add(10, 20));
    
  }
}
