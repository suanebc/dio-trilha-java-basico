package estruturasDeRepeticaoEArrays.exercicio.repeticao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha um número para ver a tabuada dele:");
        int tabuada  = scan.nextInt();
        System.out.println("Tabuada de " + tabuada);
        for (int i = 1; i <= 10; i++){
            System.out.println(i+" X "+tabuada+ " = " +i * tabuada);
        }
    }
}
