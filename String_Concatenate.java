import java.util.*;
class Pat
{
    public static String sort(String s3)
    {
        char tarr[]=s3.toCharArray();//convert str to array
        Arrays.sort(tarr);//sort temp arr
        return new String(tarr);//sorted array to string
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=s1+s2;
        String res=sort(s3);
        System.out.print(res);
        
        
        
    }
}