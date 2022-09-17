import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,i,j;
        N=sc.nextInt();
        for(i=N;i>=1;i--)
        {
            for(j=N;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.print("
");
        }
    }
}