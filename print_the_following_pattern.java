import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,i,j;
        N=sc.nextInt();
        for(i=1;i<=N;i++)
        {
            for(j=1;j<=N;j++)
            {
                if(i==N || j==1 || i==j)
                {
                    System.out.print('*');
                }
                else
                {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}