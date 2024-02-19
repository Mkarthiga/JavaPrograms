/*
def ProductSmallestPair(sum, arr)

The function accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair

NOTE

Return -1 if array is empty or if n<2
Return 0, if no such pairs found
All computed values lie within integer range
Input

sum:9

size of Arr = 7

Arr:5 2 4 3 9 7 1

Output

2
*/



import java.util.*;
import java.io.*;
import java.lang.*;
public class ProductSmallestPair{
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the sum:");
        int sum=in.nextInt();
        int i;
        System.out.println("Enter the length:");
        int[] arr=new int[in.nextInt()];
        System.out.println("Enter the elements:");
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
            
        }
  
        int ans=smallPair(arr,sum);
        System.out.println(ans);
       

    }
    public static int smallPair(int[] a,int sum)
    {
       Arrays.sort(a);
       if(a.length<2)
       {
        return -1;
       }
       else if(a[0]+a[1]<=sum)
       {
        return a[0]*a[1];
       }
       else
       {
        return 0;
       }
    }
}