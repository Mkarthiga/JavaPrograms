//Write a program to check whether the given string can be converted to a palindrome or not.
import java.util.*;
import java.io.*;
import java.lang.*;
public class ConvertedPalindrome{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        String str;
        boolean result;
        System.out.println("Enter the string:");
        str=in.nextLine();
        result=checkPalindrome(str);
        if(result)
        {
            System.out.println("Palindrome is possible");
        }
        else
        System.out.println("Can't be converted into palindrome string");

    }
    public static boolean checkPalindrome(String str)
    {
        int i;
        int SIZE_CHAR=256;
        int arr_count[]=new int[SIZE_CHAR];
        Arrays.fill(arr_count,0);
        for(i=0;i<str.length();i++)
        {
            arr_count[(int)(str.charAt(i))]++;
        }
        int odd_count=0;
        for(i=0;i<SIZE_CHAR;i++)
        {
            if((arr_count[i ]& 1)==1)
                odd_count++;
            if(odd_count>1)
             return false;
        }
      
            return true;

    }
}