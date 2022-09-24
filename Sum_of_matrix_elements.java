import java.util.Scanner;
class Arr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int M,N,i,j,cn=0;
        M=sc.nextInt();
        N=sc.nextInt();
        int A[][]=new int[M][N];
        for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
                cn+=A[i][j];
            }
        }
        System.out.print(cn);
        sc.close();
    }
}