import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,i,K,s=0;
        N=sc.nextInt();
        int arr[]=new int[N];
        for(i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        K=sc.nextInt();
        for(i=0;i<K;i++)
        {
            s+=arr[i];
        }
        System.out.println(s);
    }
}