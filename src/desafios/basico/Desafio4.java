package desafios.basico;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();

        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada
        int quantidade = doce * 2;
        System.out.println("O cliente obteve "+quantidade + " doces");
    }
}
