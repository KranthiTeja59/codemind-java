import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,K,c=0;
        N=sc.nextInt();
        K=sc.nextInt();
        int[] a=new int[N];
        for(int i=0;i<N;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if(a[i]%K==0)
            {
                c+=1;
            }
        }
        System.out.println(N-c);
        
    }
}