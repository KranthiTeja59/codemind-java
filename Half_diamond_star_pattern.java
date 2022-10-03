import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        if(n>=3 && n<=100)
        {
           for(i=1;i<(2*n);i++)
           {
               for(j=1;j<=n;j++)
               {
                   if(i==j || (i+j)==2*n ||((i+j)<2*n && i>j))
                   {
                    System.out.print('*');
                   }
                }
                System.out.println();
            } 
        }
        else
        System.out.print("The pattern is not possible");
        
        
    }
}
/*
11 12 13 14 15
21 22 23 24 25
31 32 33 34 35
41 42 43 44 45
51 52 53 54 55
61 62 63 64 65
71 72 73 74 75
81 82 83 84 85
91 92 93 94 95
*/

