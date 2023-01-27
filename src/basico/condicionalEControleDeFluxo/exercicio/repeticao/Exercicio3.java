package basico.condicionalEControleDeFluxo.exercicio.repeticao;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;
        int count = 0;
        int maior = 0;

        do {
            System.out.print("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;


            if (numero > maior) maior = numero;

            count++;

        } while (count < 5);
        System.out.println("Media: " + soma/5);
        System.out.println("Maior: " + maior);
    }


}
