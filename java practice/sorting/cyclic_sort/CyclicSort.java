
import java.lang.System;
import java.util.Scanner;
import java.util.Arrays;
 
public class cyclic
{
    public static void main(String[] args) 
    {
      int[] arr ={2,1,3,8,5,9,6,7,4};
      cyclic(arr);
      System.out.println(Arrays.toString(arr));
    }

    static void cyclic(int[] arr)
    {
      int  i =0;

      while(i<arr.length)
      {
        int correct = arr[i] -1;
        if(arr[i] !=  arr[correct])
        {
           int temp ;

           temp = arr[i];
           arr[i] = arr[correct];
           arr[correct] = temp;
        }
        else
        {
        i++;
        }
      }
    }

}