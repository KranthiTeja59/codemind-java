import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        float av;
        a=sc.nextInt();
        b=sc.nextInt();
        av=(float)(a+b)/2;
        System.out.format("%.4f",av);
    }
}