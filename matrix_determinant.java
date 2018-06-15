import java.util.*;
public class matrix_determinant
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of the square matrix");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the square matrix");
        int[][] matrix = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
         matrix_determinant Obj_d=new matrix_determinant();
        System.out.println("The determinant of the Given Matrix is : "+ Obj_d.determinant(matrix));
        sc.close();
    }

public static int determinant(int[][] matrix){ 
    int det=0; 
    int sign;
    if(matrix.length==1){
      return(matrix[0][0]);
    }
    for(int i=0;i<matrix.length;i++){ 
      int[][]smaller= new int[matrix.length-1][matrix.length-1]; 
      for(int a=1;a<matrix.length;a++){
        for(int b=0;b<matrix.length;b++){
          if(b<i){
            smaller[a-1][b]=matrix[a][b];
          }
          else if(b>i){
            smaller[a-1][b-1]=matrix[a][b];
          }
        }
      }
      if(i%2==0){ 
        sign=1;
      }
      else{
        sign=-1;
      }
      det+=sign*matrix[0][i]*(determinant(smaller)); 
    }
    return(det); 
  }
}
