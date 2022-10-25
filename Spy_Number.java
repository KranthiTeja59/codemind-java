import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,s=0,p=1;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            s+=r;
            p*=r;
            n=n/10;
        }
        if(s==p)
         System.out.println("Spy Number");
        else
         System.out.println("Not Spy Number");
    }
}