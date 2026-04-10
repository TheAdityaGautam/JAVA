package JAVA_Journey.arrays;

public class Array_Addition_2D {
    public static void main (String args[]){
        int [][] m1 = {{1,2,3},
                       {4,5,6}};
        int [][] m2 = {{10,20,30},
                       {40,50,60}};
        int [][] result = {{0,0,0},
                           {0,0,0}};
        for(int i=0; i<m1.length; i++){
            for(int j=0; j<m1[i].length; j++){
                result[i][j] = m1[i][j] + m2[i][j];
                System.out.print(" "+result[i][j]);
            }
            System.out.println();
        }
    }
}
