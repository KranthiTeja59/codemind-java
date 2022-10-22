import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,i;
        N=sc.nextInt();
        int a[]=new int[N];
        int b[]=new int[N];
        for(i=0;i<N;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<N;i++)
        {
            b[i]=sc.nextInt();
        }
        for(i=0;i<N;i++)
        {
            System.out.print(a[i]+b[i]+" ");
        }
    }
}