public class pattern {
    public static void main(String[] args) {
        
        int i,j,num=15;

        for(i=0;i<num;i++)
        {
            for(j=0;j<num;j++)
            { 
                
                if(i==0||i==(num-1)/2||j==0)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            
            }
            System.out.println();
        }
        
    }
}
