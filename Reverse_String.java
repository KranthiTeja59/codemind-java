import java.util.*;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res=" ";
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            res=ch+res;
        }
        System.out.print(res);
    }
}