import java.util.*;
import java.io.*;
public class Operations{
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a and b:");
        int a=in.nextInt();
        int b=in.nextInt();
        FourOperations f1=new FourOperations(a,b);
        System.out.println("The value of a:"+f1.getValue1());
        System.out.println("The value of b:"+f1.getValue2());
        System.out.println("Add:"+f1.add()+"\nSub:"+f1.sub()+"\nMultiplication:"+f1.multi()+"\nDivide:"+f1.div());
    }
}
class FourOperations{
    int n1,n2;
    public FourOperations(int a,int b)
    {
        this.n1=a;
        this.n2=b;
    }
    public int getValue1()
    {
        return this.n1;

    }
    public int getValue2()
    {
        return this.n2;

    }
    public int add(){
        return this.n1+this.n2;
    }
     public int sub(){
        return this.n1-this.n2;
    }
     public int multi(){
        return this.n1*this.n2;
    }
     public int div(){
        return this.n1/this.n2;
    }
}