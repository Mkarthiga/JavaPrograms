/*Problem Description :
The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. You are required to implement the following function:

int OperationsBinaryString(char* str);

The function accepts a string str as its argument. The string str consists of binary digits eparated with an alphabet as follows:

– A denotes AND operation
– B denotes OR operation
– C denotes XOR Operation
You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same.

Note:

No order of priorities of operations is required
Length of str is odd
If str is NULL or None (in case of Python), return -1
Input:
str: 1C0C1C1A0B1

Output:
1
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class BinaryOperations{
    public static void main(String[] args)
    {
        int ans=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string:");
        String st=in.nextLine();
        char[] st_arr=st.toCharArray();
        for(int i=0;i<st_arr.length;i++)
        {
            if(st_arr[i]=='A')
            {
                if(i!=1)
                {
                    ans&=Integer.parseInt(Character.toString(st_arr[i+1]));
                }
                else{
                    ans=Integer.parseInt(Character.toString(st_arr[i-1]))&Integer.parseInt(Character.toString(st_arr[i+1]));
                }
            }
            else if(st_arr[i]=='B')
            {
                 if(i!=1)
                {
                    ans|=Integer.parseInt(Character.toString(st_arr[i+1]));
                }
                else{
                    ans=Integer.parseInt(Character.toString(st_arr[i-1]))|Integer.parseInt(Character.toString(st_arr[i+1]));
                }
            }
            else if(st_arr[i]=='C')
            {
                if(i!=1)
                {
                    ans^=Integer.parseInt(Character.toString(st_arr[i+1]));
                }
                else{
                    ans=Integer.parseInt(Character.toString(st_arr[i-1]))^Integer.parseInt(Character.toString(st_arr[i+1]));
                }

            }
        }
        System.out.println(ans);
    }
}