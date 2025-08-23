import java.lang.System;
import java.util.Scanner;
import java.util.Arrays;
 
public class insertion
{
    public static void main(String[] args) 
    {
      
      int[] arr = { 5,3,4,-1,1,2,2};
      insertion(arr);
      System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr)
    {

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                int temp ;
               if(arr[j]<arr[j-1]){

               temp = arr[j];
               arr[j] = arr[j-1];
               arr[j-1] = temp;

               }
               else
               {
                //if arr[j-1] is less than arr[j] 
                // then left side elements is already sorted 
                // so lets break the statement!
                break;
               }
            }
        }
    }
}

    