import java.util.Scanner;
class Pat
{
    public static boolean sq(int m)
    {
        int s;
        s=(int)Math.sqrt(m);
        if(m-(s*s)==0.0)
        {
            return true;
        }
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(sq(arr[i]))
            {
                s+=arr[i];
            }
        }
        System.out.print(s);
        
    }
}