import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,r,max=0;
        N=sc.nextInt();
        while(N>0)
        {
            r=N%10;
            if(r>max)
             max=r;
            N=N/10;
        }
        System.out.println(max);
    }
}