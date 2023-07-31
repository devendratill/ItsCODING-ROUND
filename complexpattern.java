/**
 * complexpattern
 */
public class complexpattern {

    public static void main(String[] args) {
        int i,j,n=10;
        for ( i = 0; i < n; i++) 
        {
            System.out.println();
            for(j=0;j<n;j++)
            {
                if (i==(n-1)/2||j==(n-1)/2||j==0&&i<=(n-1)/2||i==(n-1)&&j<=(n-1)/2||i==0&&j>=(n-1)/2||i>=(n-1)/2&&j==(n-1)) 
                {
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
        
            
        }
    }
}