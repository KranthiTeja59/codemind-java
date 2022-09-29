import java.util.Scanner;
class Si
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,si,p,t,r;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        si=(p*t*r)/100;
        System.out.print(si);
        
    }
}