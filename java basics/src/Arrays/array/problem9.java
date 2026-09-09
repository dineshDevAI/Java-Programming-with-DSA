//copy one array into another
package src.Arrays.array;
/**
 * problem9
 */
public class problem9 {

    public static  void main(String args[]){
        int arr1 []={10,20,3,04,0,50,60};
        int arr2 []=new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];

        }
        System.err.println("copid array");
        for(int i=0; i<arr2.length;i++){
        System.out.print(arr2[i]+" ");
        }
 
    }
}
