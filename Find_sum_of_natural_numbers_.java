import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,i,res;
        res=0;
        N=sc.nextInt();
        for(i=0;i<=N;i++)
        {
            res+=i;
        }
        System.out.print(res);
    }
}