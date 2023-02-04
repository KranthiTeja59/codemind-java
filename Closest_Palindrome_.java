import java.util.Scanner;
class Pat
{
    public static boolean pal(int n)
    {
        int temp=n,rev=0;
        while(n!=0)
        {
           int r=n%10;
           rev=rev*10+r;
           n=n/10;
        }
        if(rev==temp)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        int N=sc.nextInt();
        for(i=N-1;i>0;i--)
        {
            if(pal(i))
            break;
        }
        for(j=N+1;j>N;j++)
        {
            if(pal(j))
            break;
        }
        if(Math.abs(N-i)<Math.abs(j-N))
        System.out.println(i);
        else if(Math.abs(N-i)==Math.abs(j-N))
        System.out.println(i+" "+j);
        else
        System.out.println(j);
    }
}