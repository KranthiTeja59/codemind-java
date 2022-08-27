import java.util.Scanner;
class mul
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,r;
        a=sc.nextFloat();
        b=sc.nextFloat();
        r=a*b;
        System.out.format("%.2f",r);
    }
}