import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,i,a,b;
        N=sc.nextInt();
        for(i=0;i<N;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a+b);
        }
    }
}