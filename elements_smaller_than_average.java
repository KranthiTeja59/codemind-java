import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,i,c=0,s=0,av;
        N=sc.nextInt();
        int arr[]=new int[N];
        for(i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<N;i++)
        {
            s+=arr[i];
        }
        av=s/N;
        for(i=0;i<N;i++)
        {
            if(arr[i]<=av)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}