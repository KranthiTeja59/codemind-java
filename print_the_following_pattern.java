import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,i,j;
        N=sc.nextInt();
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                if(i==j)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("x");
                }
            }
            System.out.print("
");
        }
    }
}