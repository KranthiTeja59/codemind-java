import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int hf,si,sp;
        hf=sc.nextInt();
        si=sc.nextInt();
        sp=sc.nextInt();
        if(hf>50 && si>60 && sp>100)
        {
            System.out.print(10);
        }
        else if(hf>50 && si>60)
        {
            System.out.print(9);
        }
        else if(si>60 && sp>100)
        {
            System.out.print(8);
        }
        else if(hf>50 && sp>100)
        {
            System.out.print(7);
        }
        else if(hf>50 && (si<=60 && sp<=100))
        {
            System.out.print(6);
        }
        else if(si>60 && (hf<=50 && sp<=100))
        {
            System.out.print(6);
        }
        else if(sp>100 && (si<=60 && hf<=50))
        {
            System.out.print(6);
        }
        else
        {
            System.out.print(5);
        }
    }
}