public class KBP_2_g_6x6Two_dimensional {
    public static void main(String[] args) {
        int[][] a= new int[6][6];
        System.out.println("The 6X6 Matrix is - ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j] = (int)(Math.random()*2);
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------");
        checkRow(a);
        System.out.println("--------------------------------------------");
        checkColumn(a);
    }
    public static void checkRow(int [][] matrix)
    {
        int count;
        for(int i=0;i<matrix.length;i++)
        {
            count=0;
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[i][j] == 1){
                    count++;
                }
            }
            if(count%2!=0){
                System.out.println("Row#"+i+"contains odd numbers od 1's .");
            }
        }
    }
    public static void  checkColumn(int [][] matrix){
        int count;
        for(int i=0;i<matrix.length;i++)
        {
            count=0;
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[i][j] == 1){
                    count++;
                }
            }
            if(count%2!=0){
                System.out.println("Column#"+i+"contains odd numbers od 1's .");
            }
        }
    }
}
