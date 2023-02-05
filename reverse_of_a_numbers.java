import java.util.Scanner;
class Demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int temp=N,r,s=0;
        while(N!=0)
        {
            r=N%10;
            s=s*10+r;
            N=N/10;
        }
        System.out.println(s);
    }
}