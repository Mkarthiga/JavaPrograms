/*Problem Description :
The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

Note:

Return -1 if the array is null
Return 0 if the total amount of food from all houses is not sufficient for all the rats.
Computed values lie within the integer range.
Example:

Input:

r: 7
unit: 2
n: 8
arr: 2 8 3 5 7 4 1 2
*/ 
import java.util.*;
import java.io.*;
import java.lang.*;
public class RatCountHouse
{
    public static void main(String[] args)
    {
        int temp=0;
        Scanner in =new Scanner(System.in);
        System.out.println("Number of rats:");
        int r=in.nextInt();
        System.out.println("Amount of food each consume:");
        int unit=in.nextInt();
        System.out.println("Array size:");
        int n=in.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        int sum=r*unit;
        for(int i=0;i<n;i++)
        {
            if(temp<sum)
            {
                temp+=arr[i];
            }
            else{
                System.out.println(i);
                break;
            }
        }
    }
}