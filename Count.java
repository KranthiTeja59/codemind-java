import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,i,ec=0,oc=0;
        N=sc.nextInt();
        int arr[]=new int[N];
        for(i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<N;i++)
        {
            if(arr[i]%2==0)
            {
                ec+=1;
            }
            else
            oc+=1;
        }
        System.out.print(ec+" "+oc);
        
    }
}