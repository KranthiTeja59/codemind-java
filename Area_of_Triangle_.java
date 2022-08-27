import java.util.Scanner;
class tria
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A,B,C;
        float s,area;
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        s=(float)(A+B+C)/2;
        area=(float)Math.sqrt(s*(s-A)*(s-B)*(s-C));
        System.out.format("%.2f",area);
    }
}