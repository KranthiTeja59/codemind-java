import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int L,B,W,C,out,ta,ia;
        L=sc.nextInt();
        B=sc.nextInt();
        W=sc.nextInt();
        C=sc.nextInt();
        ta=(L+2*W)*(B+2*W);
        ia=L*B;
        out=ta-ia;
        System.out.println(out*C);
        
    }
}