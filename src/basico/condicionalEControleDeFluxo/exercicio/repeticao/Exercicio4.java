package basico.condicionalEControleDeFluxo.exercicio.repeticao;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int quantidadeNumeros;
         int numero;
         int pares = 0;
         int impares = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;

        do{
            System.out.print("Número: ");
            numero = scan.nextInt();

            if(numero % 2 ==0) pares++;
            else impares++;

            count++;
        }while(count < quantidadeNumeros);

        System.out.println("Quantidade de números pares: "+pares);
        System.out.println("Quantidade de numero impares: " +impares);
    }

}
