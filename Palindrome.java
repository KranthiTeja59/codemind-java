import java.util.Scanner;
class Demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int temp=N;
        int s=0,r;
        while(N!=0)
        {
                r=N%10;
                s=s*10+r;
                N=N/10;
        }
        if(s==temp)
        System.out.println("True");
        else
        System.out.println("False");
        
        
    }
}