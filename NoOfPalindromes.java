import java.util.*;
import java.lang.*;
import java.io.*;
public class NoOfPalindromes
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the start and end values:");
        int start=in.nextInt();
        int end=in.nextInt();
        int result=numOfPalindromes(start,end);
        System.out.print("Total Number Of Palindromes:");
        System.out.print(result);
    }
    public static int numOfPalindromes(int start,int end)
    {
        int count=0,i=start;
        while(i<=end)
        {
            count+=checkPalindrome(String.valueOf(i));
            i++;
        }
        return count;
    }
    public static int checkPalindrome(String str)
    {
        StringBuilder str_b=new StringBuilder(str);
        String rev=str_b.reverse().toString();
        int val=str.compareTo(rev);
        if(val==0)
        {
            return 1;
        }
        else 
            return 0;
    }
}