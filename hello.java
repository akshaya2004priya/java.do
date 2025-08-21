import java.lang.System;
import java.util.Scanner;
import java.util.Arrays;
 
public class hello 
{
    public static void main(String[] args) 
    {
    int[] arr = {0,1,2,3};
      
      int pivot = rotation(arr);
      System.out.println(pivot+1);
    }

    static int rotation(int[] arr){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){

                int mid = start + (end - start)/2;

                if(mid< end && arr[mid] > arr[mid+1]){
                        return mid;
                }
                if(mid> start && arr[mid]< arr[mid-1]){
                        return mid-1;
                }
                if(arr[start]>=arr[mid]){
                        end = mid -1;
                }
                else{
                        start = mid+1;
                }
        }
        return -1;
    }

}

    


