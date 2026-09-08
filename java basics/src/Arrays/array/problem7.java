//find the average
package src.Arrays.array;

public class problem7 {
    public static void  main(String args[]){
        int arr[]={10,20,30,40,50};
      int avg=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
           avg=sum /arr.length;
        }
        System.out.println(avg);
    }
}
