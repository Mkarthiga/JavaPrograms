import java.util.*;
import java.io.*;
import java.lang.*;
public class StringToNumber{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the String:");
        String no=in.nextLine();
        int num=Integer.parseInt(no);
        System.out.println("The number is "+num);  
    }
}