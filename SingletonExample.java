import java.util.*;
import java.io.*;
public class SingletonExample
{
    public static void main(String[] args)
    {
        int ans;
        Singleton temp=Singleton.getObject();
        ans=temp.add();
        System.out.println(ans);
       // Singleton a=new Singleton();  will throw error: Singleton() has private access in Singleton
        
    }
}
class Singleton{
    Scanner in=new Scanner(System.in);
    private Singleton(){}
    private static Singleton s1=new Singleton();
    public static Singleton getObject(){
        return s1;
    }
    public int add()
    {
        System.out.println("Enter a and b:");
        int a = in.nextInt();
        int b = in.nextInt();
        return a+b ;
    }
}

