package estruturasDeRepeticaoEArrays.exercicio.repeticao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.print("Nota: ");
        nota = scan.nextInt();
        while(nota < 0 || nota > 10){
            System.out.print("Nota inválida! Digite novamente, nota: ");
            nota = scan.nextInt();
        }

    }
}
