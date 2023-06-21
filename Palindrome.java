import java.util.*;
import java.lang.*;
import java.io.*;
public class Palindrome{
    public static int checkPalindrome(String str)
    {
        StringBuilder str2=new StringBuilder(str);
        str2 = str2.reverse();
         String str1=str2.toString();
       return str1.compareTo(str);

    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=in.next();
        int result=checkPalindrome(str);
        if(result==0)
        {
            System.out.println("Palindrome");
        }
        else
        System.out.println("Non-Palindrome");
    }
   
}