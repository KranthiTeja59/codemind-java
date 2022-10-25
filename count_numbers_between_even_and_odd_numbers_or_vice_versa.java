import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,i,c=0;
        N=sc.nextInt();
        int arr[]=new int[N];
        for(i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<N-2;i++)
        {
            if((arr[i]%2==0 && arr[i+2]%2!=0)||(arr[i]%2!=0 && arr[i+2]%2==0))
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}