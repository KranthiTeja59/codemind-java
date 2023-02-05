import java.util.Scanner;
class Demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        String S=sc.nextLine();
        char C=sc.nextLine().charAt(0);
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)==C)
            c+=1;
        }
        if(c==0)
        System.out.println(-1);
        else
        System.out.println(c);
        
    }
}