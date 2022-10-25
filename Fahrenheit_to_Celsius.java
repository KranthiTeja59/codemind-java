import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float c,f;
        f=sc.nextFloat();
        c=((f-32)*5)/9;
        System.out.format("%.2f",c);
    }
}