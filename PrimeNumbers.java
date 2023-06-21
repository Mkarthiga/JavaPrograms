import java.util.*;
import java.io.*;
public class PrimeNumbers{
    public static  void getPrimeNumbers(int start,int end)
    {
        int flag;
        for(int i=start;i<=end;i++)
        {
            flag=0;
            for(int j=2;j<i/2;j++)
            {
                if(i%j==0 || i==1)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the range:");
        System.out.println("Start:");
        int start=in.nextInt();
        System.out.println("End:");
        int end=in.nextInt();
        getPrimeNumbers(start,end);
    }
}