//Write a program to implement pattern for given integer array and Pattern based on 
//occurrence of a number in integer array

import java.util.*;
import java.io.*;
import java.lang.*;
public class StarCounts{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int[] a;
        char[][] ans;
        int n,i,j,key;
        String val;
        System.out.println("Enter the array length:");
        n=in.nextInt();
        a=new int[n];
        ans=new char[10][n];
        System.out.println("Enter elements:");
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<10;i++)
        {
            for(j=0;j<n;j++)
            {
                if(j==0)
                {
                    val=String.valueOf(i);
                    ans[i][j]=val.toCharArray()[0];
                }
                else
                {
                    ans[i][j]=' ';
                }
            }
        }
        for(i=0;i<n;i++)
        {   j=1;
            key=a[i];
            if(ans[key][j]!='*')
            {
                ans[key][j]='*';
            }
            else{
                j++;
                while(ans[key][j]=='*')
                {
                    j++;
                }
                ans[key][j]='*';
            }
        }

         for(i=0;i<10;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(ans[i][j]);
            }
            System.out.println("");
        }
        
        
    }
}