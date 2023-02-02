import java.util.Scanner;
class Demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int odd=0;
        int N=sc.nextInt();
        int A[]=new int[N];
        for(int i=0;i<N;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            if(A[i]%2==1)
            {
                odd+=1;
            }
        }
        if(odd>2)
        System.out.println("NO");
        else
        System.out.println("YES");
    }
}