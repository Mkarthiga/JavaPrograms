//Write a program to move “0” digits as front side of the number without using additional 
//array
import java.util.*;
import java.io.*;
import java.lang.*;
public class MoveZeros{
    public static void main(String[] args)
    {
        int i;
        int[] a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length:");
        int n=in.nextInt();
        a=new int[n];
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        moveZeros(a,n);

    }
    public static void moveZeros(int[] a,int n)
    {
        int i,temp,zcount=0;
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                zcount++;
                temp=a[zcount-1];
                a[zcount-1]=a[i];
                a[i]=temp;
            }
        }
        System.out.println("Output");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}