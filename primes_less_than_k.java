import java.util.Scanner;
class Pat
{
    public static boolean isprim(int n)
    {
        int i;
        if(n<2)
           return false;
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
             return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,i,K,c=0;
        N=sc.nextInt();
        int arr[]=new int[N];
        for(i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        K=sc.nextInt();
        for(i=0;i<N;i++)
        {
            if(isprim(arr[i]))
            {
                if(arr[i]<=K)
                {
                    c+=1;
                }
            }
        }
        System.out.println(c);
        
    }
}