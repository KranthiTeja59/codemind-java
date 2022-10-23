import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,i,av,s=0,c=0;
        N=sc.nextInt();
        int a[]=new int[N];
        for(i=0;i<N;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<N;i++)
        {
            s+=a[i];
        }
        av=s/N;
        for(i=0;i<N;i++)
        {
            if(a[i]==av)
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