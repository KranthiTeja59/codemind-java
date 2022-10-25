import java.util.Scanner;
class Pat
{
    public static boolean isprim(int k)
    {
        int i;
        if(k<2)
         return false;
        for(i=2;i<=(int)Math.sqrt(k);i++)
        {
            if(k%i==0)
             return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i;
        m=sc.nextInt();
        n=sc.nextInt();
        for(i=m+1;i<n;i++)
        {
            if(isprim(i))
            {
                System.out.println(i);
            }
        }
    }
}