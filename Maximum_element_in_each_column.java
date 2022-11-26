import java.util.Scanner;
class Pat
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,c,i,j,max=0;
        r=sc.nextInt();
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(j=0;j<c;j++)
        {
            max=0;
            for(i=0;i<r;i++)
            {
                if(arr[i][j]>max)
                {
                    max=arr[i][j];
                }
            }
            System.out.println(max);
        }
        
        
    }
}