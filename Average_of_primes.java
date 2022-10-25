import java.util.Scanner;
class Pat
{
    public static boolean isprim(int m)
    {
        int i;
        if(m<2)
           return false;
        for(i=2;i<=(int)Math.sqrt(m);i++)
        {
            if(m%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,i,s=0,c=0;
        float av;
        N=sc.nextInt();
        int arr[]=new int[N];
        for(i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<N;i++)
        {
            if(isprim(arr[i]))
            {
                s+=arr[i];
                c+=1;
            }
        }
        av=(float)s/c;
        System.out.format("%.2f",av);
    }
}