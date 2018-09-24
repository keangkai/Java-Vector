/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

/**
 *
 * @author User
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        long startTime = System.nanoTime();
        int col = 10000;
        int row = 10000;
        float[][] a = new float[row][col];
        float[][] x = new float[col][1];
        float[][] b = new float[row][1];
        //Input float number to A
        for(int i=0; i<row ; i++){
            for(int j=0 ; j<col ; j++){
            float random1 = (float)Math.random();
            a[i][j] = random1;
            }
        }
        //Input float number to X
        for(int k=0; k<col ; k++){
            for(int l=0 ; l<1 ; l++){
            float random2 = (float)Math.random();
            x[k][l] = random2;
            }
        }
        //Calculate B from Ax=B
        for(int m=0; m<row ; m++){
            for(int n=0 ; n<1 ; n++){
                for(int round=0 ; round<row ; round++)
                {
                    b[m][n] += (a[m][n + round] * x[n +
                    round][n]);
                }
            }
        }
        //Print B
         for(int z1 = 0; z1<row ; z1++){
            for(int z2 = 0; z2<1 ; z2++){
                System.out.println("b[" + z1 + "][" +z2 + "] = " + b[z1][z2]);
            }
         }
        long endTime = System.nanoTime();
        long duration = (endTime -startTime);
        System.out.println(duration/1000000000.0+"seconds");
    }
    
}
