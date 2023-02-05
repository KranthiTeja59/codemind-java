import java.util.Scanner;
class Demo 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        int s=0,v=0,c=0,d=0;
        for(int i=1;i<S.length();i++)
        {
            if(S.charAt(i)==' ' && S.charAt(i+1)!=' ')
            s+=1;
        }
        for(int i=0;i<S.length();i++)
        {
            if((int)(S.charAt(i))==97 || (int)(S.charAt(i))==101 || (int)(S.charAt(i))==105 || (int)(S.charAt(i))==111 || (int)(S.charAt(i))==117)
            v+=1;
            else 
            c+=1;
        }
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='0' || S.charAt(i)=='1'|| S.charAt(i)=='2' || S.charAt(i)=='3'||S.charAt(i)=='4' || S.charAt(i)=='5'|| S.charAt(i)=='6' || S.charAt(i)=='7'||S.charAt(i)=='8' || S.charAt(i)=='9')
            d+=1;
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+(c-(d+s)));
        System.out.println("Digits: "+d);
        System.out.println("White spaces: "+s);
    }
}