package basico.matrizes;

import java.security.SecureRandom; //bibliotecas para geração de numeros aleatorios 

public class ArraysDeArrays{
    public static void main(String[] args){

        int[][] numeros = new int[3][5];

        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[0].length; j++){
                numeros[i][j] = new SecureRandom().nextInt(100);
            }
        }

        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros[0].length; j++){
                System.out.printf("%2d | ", numeros[i][j]);
            }
            System.out.println("");
        }
    }
}