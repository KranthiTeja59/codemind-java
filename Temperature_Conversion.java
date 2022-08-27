import java.util.Scanner;
class con
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        float f,a;
        c=sc.nextInt();
        a=(float)c*9/5;
        f=32+a;
        System.out.format("%.2f",f);
    }
}