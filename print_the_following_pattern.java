import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        int i,j,N;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        for(i=1;i<=N;i++)
        {
            for(j=1;j<=N;j++)
            {
                if((i+j)<=N+1)
                {
                    System.out.print(j);
                }
            }
            System.out.print("
");
        }
        sc.close();
    }
}
//11 12 13 14 15
//21 22 23 24 25
//31 32 33 34 35
//41 42 43 44 45
//51 52 53 54 55