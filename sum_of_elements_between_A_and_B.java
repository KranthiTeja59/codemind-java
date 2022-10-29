import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        int s=0;
        for(int i=a;i<=b;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==arr[j])
                {
                    s+=i;
                }
            }
        }
        System.out.println(s);
    }
}