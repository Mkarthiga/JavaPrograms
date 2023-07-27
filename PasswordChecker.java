/*
You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption:
Input string will not be empty.

Example:

Input 1:
aA1_67
Input 2:
a987 abC012

Output 1:
1
Output 2:
0
*/
import java.util.*;
import java.io.*;
import java.lang.*;
public class PasswordChecker
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        boolean start=false;
        int upper=0;
        int digit=0;
        boolean space=false;
        System.out.println("Enter your password:");
        String pass=in.nextLine();
        char[] pass_arr=pass.toCharArray();
         if(Character.isLetter(pass_arr[0]))
            {
                start=true;
            }
        for(int i=0;i<pass_arr.length;i++)
        {
        
            if(Character.isDigit(pass_arr[i]))
            {
                digit++;
            }
            else if(Character.isUpperCase(pass_arr[i]))
                {
                    upper++;
                }
            
            else if(Character.isWhitespace(pass_arr[i]) || pass_arr[i]=='/')
            {
                space=true;
            }

        }
        if(pass_arr.length>=4 && upper>0 && space==false && digit>0 && start==true)
        {
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}