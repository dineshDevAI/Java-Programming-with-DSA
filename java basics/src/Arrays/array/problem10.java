// find the second largest

package src.Arrays.array;

public class problem10 {
    public static  void main(String args[]){
        int arr[]={10,20,30,40,50,};

        int largest = 0;
        int secondlargest = 0;

        for(int i=0 ;i<arr.length; i++){

            if (arr[i]>largest) {
                secondlargest =largest;
                largest =arr[i];
                
            }else if(arr[i]> secondlargest && arr[i] !=largest){
                secondlargest =arr[i];
            }
        
        }
        System.out.println("Largest "+ largest);
        System.out.println("Second Largest "+secondlargest);
    }
}
