 /*Write a program to reverse the given string and if a character is not alphanumeric then it 
must remain same
Eg: Input: my house is on fire!!
 Output: erif no si esuoh ym!!*/
import java.util.*;
import java.io.*;
import java.lang.*;
public class SwapAlphaNumeric{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=in.nextLine();
        swapAlphaNumeric(str);
        
    }
    public static void swapAlphaNumeric(String str)
    {
        int n=str.length();
        boolean swap;
        int i,count=0;
        char temp;
        char[] char_arr=str.toCharArray();
        System.out.println("The Input String:");
        for(i=0;i<n;i++)
        {
            System.out.print(char_arr[i]);
        }
        System.out.println(" ");
        if(n%2==0)
        {
        for(i=0;i<n/2;i++)
        {
            swap=false;
            if(Character.isLetter(char_arr[i]) || Character.isDigit(char_arr[i]) || Character.isWhitespace(char_arr[i]) )
            {
                while(swap==false)
                {
                if(Character.isLetter(char_arr[n-1-i-count]) || Character.isDigit(char_arr[n-1-i-count]) || Character.isWhitespace(char_arr[n-1-i-count]))
                {
                    temp=char_arr[n-1-i-count];
                    char_arr[n-1-i-count]=char_arr[i];
                    char_arr[i]=temp;
                    swap=true;
                }
                else{
                    count++;
                }
                }
            }
        

        }
        }
        else    
        {
        for(i=0;i<n/2-1;i++)
        {
            swap=false;
            if(Character.isLetter(char_arr[i]) || Character.isDigit(char_arr[i]) || Character.isWhitespace(char_arr[i]) )
            {
                while(swap==false)
                {
                if(Character.isLetter(char_arr[n-1-i-count]) || Character.isDigit(char_arr[n-1-i-count]) || Character.isWhitespace(char_arr[n-1-i-count]))
                {
                    temp=char_arr[n-1-i-count];
                    char_arr[n-1-i-count]=char_arr[i];
                    char_arr[i]=temp;
                    swap=true;
                }
                else{
                    count++;
                }
                }
            }
        

        }
        }
        System.out.println("The reversed String:");
         for(i=0;i<n;i++)
        {
            System.out.print(char_arr[i]);
        }
        
    }
}