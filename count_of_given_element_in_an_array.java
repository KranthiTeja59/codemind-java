import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,i,z,c=0;
        N=sc.nextInt();
        int arr[]=new int[N];
        for(i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        z=sc.nextInt();
        for(i=0;i<N;i++)
        {
            if(arr[i]==z)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}