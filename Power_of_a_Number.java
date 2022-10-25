import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,M;
        x=sc.nextInt();
        y=sc.nextInt();
        M=sc.nextInt();
        System.out.println((int)Math.pow(x,y)%M);
    }
}