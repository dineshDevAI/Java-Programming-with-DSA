//Second smallest

package src.Arrays.array;

public class problem11 {
    
    public static void main(String args[]){
        int arr[]={10,20,5,50,2};

        int smallest =Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){

            if (arr[i]< smallest) {
                secondsmallest = smallest;
                smallest =arr[i];     

            }else if(arr[i] < secondsmallest && arr[i] !=smallest){
                secondsmallest =arr[i];
            }
        }
        System.out.println("Smallest "+smallest);
        System.out.println("Second smallest"+secondsmallest);
    }
}
