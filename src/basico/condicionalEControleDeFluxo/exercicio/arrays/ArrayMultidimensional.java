package basico.condicionalEControleDeFluxo.exercicio.arrays;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] arrayMult = new int[4][4];

        for(int i = 0; i < arrayMult.length; i++){
            for (int j = 0; j < arrayMult[i].length; j++){
                arrayMult[i][j] = random.nextInt(9);
            }
        }
            System.out.println("Matriz: ");
            for (int[] linha : arrayMult){
                for (int coluna : linha){
                    System.out.print(coluna + " ");
                }
                System.out.println();
            }

    }
}
