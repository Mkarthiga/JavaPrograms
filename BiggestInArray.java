import java.util.*;
import java.io.*;
import java.lang.*;
public class BiggestInArray
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int[] a;
        int n,i,result;
        System.out.println("Enter the array length:");
        n=in.nextInt();
        a=new int[n];
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        result=biggestNumber(a,n);
        System.out.println(result+"is the biggest number in the array");
    }
    public static int biggestNumber(int[] a,int n)
    {
        int i,temp=0;
        for(i=0;i<n;i++)
        {

            if(temp<a[i])
            {
                temp=a[i];
            }
        }
       
        return temp;
    }
}