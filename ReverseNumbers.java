//Given a 3 or 2 digit number, add it with its reverse and check if the result is palindrome. If
//not, add the result with its result and continue this process for 5 times.
import java.util.*;
import java.lang.*;
import java.io.*;
public class ReverseNumbers{
    public static int reverseCheck(int no){
        int count=0;
        String num=String.valueOf(no);
        StringBuilder num1=new StringBuilder(num);
        num1=num1.reverse();
        int no2=Integer.parseInt(num1.toString());
        int ans=no+no2;
        int result=checkPalindrome(String.valueOf(ans));
        if(result==0)
        {
            System.out.println(ans+" is Palindrome");
            return 0;
        }
        else
        {
            while(count<5){
                System.out.println("Count:"+count);
                reverseCheck(ans+ans);
                count++;
            }
        }
        return 0;
    }
     public static int checkPalindrome(String str)
    {
        StringBuilder str2=new StringBuilder(str);
        str2 = str2.reverse();
         String str1=str2.toString();
       return str1.compareTo(str);

    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int no=in.nextInt();
        reverseCheck(no);
       
    }
}