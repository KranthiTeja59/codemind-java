import java.util.Scanner;
class hand
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r;
        n=sc.nextInt();
        r=(n*(n-1))/2;
        System.out.println(r);
    }
}