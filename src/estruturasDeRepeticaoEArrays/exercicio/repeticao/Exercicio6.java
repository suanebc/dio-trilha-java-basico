package estruturasDeRepeticaoEArrays.exercicio.repeticao;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;
        System.out.print("fatorial de " + fatorial +" = ");
        for (int i = fatorial; i > 1;i--){
            multiplicacao *= i;
        }
        System.out.println(multiplicacao);
    }
}
