import java.lang.System;
import java.util.Scanner;
import java.util.Arrays;
 
public class selection
{
    public static void main(String[] args) 
    {
     int[] arr = {3,4,-197,3,89,7,80,0,9};

     selection(arr);
     System.out.print(Arrays.toString(arr));
    

    }
    
     static void selection(int[] arr){

      for(int i =0;i<arr.length;i++){

        int last_index = arr.length-i-1;
        int max_index =  max(arr,0,last_index);
        swap(arr , max_index,last_index);
      }
    }
       static void swap(int[] arr,int first ,int second){
        int temp;

        temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        
      
    }

      static int max(int[] arr,int start,int end){

        int max =start;

        for(int i = start;i<=end;i++){

          if(arr[max]<arr[i]){

            max = i;
          }
        }
       return max;
        
      }


    }



    