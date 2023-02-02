import java.util.Scanner;
class Pat
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,s=0;
        N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            s+=arr[i];
        }
        System.out.println(s);
        
    }
}