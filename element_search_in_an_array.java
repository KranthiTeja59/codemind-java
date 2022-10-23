import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,r,i,c=0;
        N=sc.nextInt();
        int a[]=new int[N];
        for(i=0;i<N;i++)
        {
            a[i]=sc.nextInt();
        }
        r=sc.nextInt();
        for(i=0;i<N;i++)
        {
            if(a[i]==r)
            {
                System.out.println("True");
                c+=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("False");
        }
    }
}