/*
You are given a function,
int findCount(int arr[], int length, int num, int diff);

The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’. Implement this function to find and return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’.
Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

Example:
Input:

arr: 12 3 14 56 77 13
num: 13
diff: 2
Output:
3
*/
import java.util.*;
import java.io.*;
import java.lang.*;
public class NumberOfDiff
{
    public static void main(String[] args)
    {
        int cnt=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int[] arr=new int[in.nextInt()];
        System.out.println("Enter the num and diff:");
        int num=in.nextInt();
        int diff=in.nextInt();
        System.out.println("Enter elements:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(Math.abs(arr[i]-num)<=2)
            {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}