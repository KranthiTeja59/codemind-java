import java.util.Scanner;
class Demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,s=0;
        N=sc.nextInt();
        for(int i=2;i<N;i++)
        {
            if(N%i==0)
            {
                s+=i;
            }
        }
        if(s>N)
        System.out.println("True");
        else
        System.out.println("False");
    }
}