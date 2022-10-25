import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float c,f;
        c=sc.nextFloat();
        f=(c*9/5)+32;
        System.out.format("%.2f",f);
    }
}