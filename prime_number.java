import java.util.Scanner;
class Pat
{
    public static boolean isprim(int m)
    {
        int i;
        if(m<2)
         return false;
        for(i=2;i<=(int)Math.sqrt(m);i++)
        {
            if(m%i==0)
             return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(isprim(n))
         System.out.println("prime");
        else
         System.out.println("not a prime");
    }
}