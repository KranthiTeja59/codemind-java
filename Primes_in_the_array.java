import java.util.Scanner;
class Pat
{
    public static boolean ispri(int n)
    {
        int i;
        if(n<2)
           return false;
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
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
            if(ispri(arr[i]))
            {
                c+=1;
            }
        }
        System.out.println(c);
        
    }
}