/*. Credits for the customer
for every 100 rupees – 2 points
for every 500 rupees – 3 points
for every 1000 rupees – 4 points
for every 5000 rupees – 5 points.
Calculate the credits obtained by the customer.
Example : Rs. 4990 -> credits = 27
Hint : 4 * 1000 + 500 * 1 + 100 * 4 + 90 => 16 + 3 + 8 = 27
 */

import java.util.*;
import java.io.*;
import java.lang.*;
public class CustomerCredits{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amt=in.nextInt();
        int points=calculateCredits(amt);
        System.out.println("Total credits: "+points);
    }
    public static int calculateCredits(int amt)
    {
        int temp=amt,credits=0,val,a,b;
        int[] credits_amt={5000,1000,500,100};
        int[] credits_val={5,4,3,2};
        int i=0;
      while(temp>=100)
      {
            val=temp%credits_amt[i];
            if(temp==val);
            else{
                a=temp/credits_amt[i];
                credits+=a*credits_val[i];
                temp%=credits_amt[i];
            }
            i++;          
      }
      return credits;
    }
}