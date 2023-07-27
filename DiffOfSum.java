/*
def differenceofSum(n. m)

The function accepts two integers n, m as arguments Find the sum of all numbers in range from 1 to m(both inclusive) that are not divisible by n. Return difference between sum of integers not divisible by n with sum of numbers divisible by n.

Assumption:

n>0 and m>0
Sum lies between integral range
Example

Input
n:4
m:20
Output
90
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class DiffOfSum{
    public static void main(String[] args)
    {
     Scanner in=new Scanner(System.in);
     System.out.println("Enter n and m:");
     int div=0;
     int undiv=0;
     int n=in.nextInt();
     int m=in.nextInt();
    for(int i=1;i<=m;i++)
    {
        if(i%n==0)
        {
            div+=i;
        }
        else{
            undiv+=i;
        }
    }
    System.out.println(undiv-div);

    }
}