/*
def LargeSmallSum(arr)

The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest  element from the even positions and second smallest from the odd position of given ‘arr’

Assumption:

All array elements are unique
Treat the 0th position as even
NOTE

Return 0 if array is empty
Return 0, if array length is 3 or less than 3
Example

Input

arr:3 2 1 7 5 4

Output

7
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class LargeSmallSum
{
    public static void main(String[] args)
    {
        int oddtemp=0,oddcnt=0;
        int eventemp=0,evencnt=0;
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the size of array");
      int[] arr=new int[in.nextInt()];
      System.out.println("Enter the elements:");
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=in.nextInt();
        if(i%2==0)
          evencnt++;
        else
          oddcnt++;
      } 
      int[] odd=new int[oddcnt];
      int[] even=new int[evencnt];
      int e=0;
      int o=0;
      for(int i=0;i<arr.length;i++)
      {
        if(i%2==0)
        {
          even[e]=arr[i];
          e++;
        }
        else{
          odd[o]=arr[i];
          o++;
        }
      }
      Arrays.sort(even);
      Arrays.sort(odd);
      System.out.println(odd[1]+even[even.length-2]);

    }
}