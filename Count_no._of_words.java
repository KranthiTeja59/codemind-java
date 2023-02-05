import java.util.Scanner;
class Demo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        String S=sc.nextLine();
        if(S.charAt(0)!=' ')
        c+=1;
        for(int i=1;i<S.length();i++)
        {
            if(S.charAt(i)==' ' && S.charAt(i+1)!=' ')
            c+=1;
        }
        System.out.println(c);
    }
}