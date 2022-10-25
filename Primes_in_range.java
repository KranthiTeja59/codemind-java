import java.util.Scanner;
class Pat
{
    public static boolean isprim(int a)
    {
        int i;
        if(a<2)
         return false;
        for(i=2;i<=(int)Math.sqrt(a);i++)
        {
            if(a%i==0)
             return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,c=0;
        m=sc.nextInt();
        n=sc.nextInt();
        for(i=m;i<=n;i++)
        {
            if(isprim(i))
            c+=1;
        }
        System.out.println(c);
        
    }
}