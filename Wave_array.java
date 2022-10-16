import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,a=0,b=0;
        N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N-1;i+=2)
        {
            if(arr[i]<arr[i+1])
            {
                a+=1;
            }
            if(arr[i]>arr[i+1])
            {
                b+=1;
            }
        }
        if(a==N/2 || b==N/2)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}