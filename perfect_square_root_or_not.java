import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,s;
        float sq;
        n=sc.nextInt();//25
        sq=(float)Math.sqrt(n);//5
        s=(int)Math.sqrt(n);
        if(sq-s==0.0)
         System.out.println("True");
        else
         System.out.println("False");
    }
}