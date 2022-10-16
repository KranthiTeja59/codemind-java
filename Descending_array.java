import java.util.Scanner;
class Sol
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,t=0;
        N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                System.out.println("no");
                t=1;
                break;
            }
        }
        if(t==0)
        {
            System.out.println("yes");
        }
    }
}