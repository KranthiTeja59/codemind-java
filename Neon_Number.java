import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sq,ss=0,r;
        n=sc.nextInt();
        sq=n*n;
        while(sq>0)
        {
            r=sq%10;
            ss+=r;
            sq=sq/10;
        }
        if(ss==n)
         System.out.println("Neon Number");
        else
         System.out.println("Not Neon Number");
    }
}