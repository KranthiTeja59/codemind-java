import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,i;
        N=sc.nextInt();
        int arr[]=new int[N];
        for(i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=N-1;i>=0;i--)
        {
            if(arr[i]%2==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}