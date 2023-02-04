import java.util.Scanner;
class Demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,R;
        N=sc.nextInt();
        R=sc.nextInt();
        for(int i=1;i<=R;i++)
        {
            if(i%2!=0)
            {
                System.out.println(N+" x "+i+" = "+(N*i));
            }
        }
    }
}