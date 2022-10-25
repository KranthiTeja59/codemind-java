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
        for(i=0;i<N;i++)
        {
            if(arr[i]==0 || arr[i]%2==0)
            {
                c+=1;
            }
        }
        if(c==N)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}