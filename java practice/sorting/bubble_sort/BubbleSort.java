

import java.lang.System;
import java.util.Scanner;
import java.util.Arrays;
 
public class bubblesort
{
    public static void main(String[] args) 
    {
        int[] arr = {1,2,3,4,5,0,8,5,3,0,3,7};
        int n = arr.length;
        int temp = 0;

        System.out.println(Arrays.toString(sort(arr,n,temp)));
    }

    static int[] sort(int[] arr,int n,int temp){

        for(int i =0; i<n;i++){
            for(int j=0;j<n-i-1;j++){
           
            if(arr[j]<arr[j+1])
            {
            }
            else{
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }

            }
        }
        return arr;
    }

} 


