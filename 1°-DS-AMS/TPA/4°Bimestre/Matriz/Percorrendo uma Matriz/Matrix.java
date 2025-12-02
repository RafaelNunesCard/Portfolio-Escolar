
package com.mycompany.matrix;

public class Matrix {
    
    public static void main(String[] args) {
        int [][]matrizNum = {
            {1,2,3},
            {2,3,4}
        };
        System.out.println("Os valores de sua matriz:");
        for (int i = 0; i < matrizNum.length; i++) {
            for (int j = 0; j < matrizNum[i].length; j++) {
                System.out.printf("| %-3d ", matrizNum[i][j]);  // %-4d dá um espaço
            }
            System.out.println("|");                            //pular linha
        }
    }
}
