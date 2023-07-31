public class jaggedarr {
    public static void main(String[] args) {
        int num[][]={
            {2,3,5,6},
            {7,6},
            {9,4,6}
        };
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<num[i].length;j++)
            {
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}
