package sintaxeJava;
import java.util.Date;

public class Operadores {
    //classe Operadores.java
    String nome = "GLEYSON";
    int idade = 22;
    double peso = 68.5;
    char sexo = 'M';
    boolean doadorOrgao = false;
    Date dataNascimento = new Date();
    //classe Operadores.java
    String nomeCompleto = "LINGUAGEM" + "JAVA";

    //qual o resultado das expressoes abaixo?
    String concatenacao ="?";
/*
    concatenacao = 1+1+1+"1";

    concatenacao = 1+"1"+1+1;

    concatenacao = 1+"1"+1+"1";

    concatenacao = "1"+1+1+1;

    concatenacao = "1"+(1+1+1);
    */

    public static void main(String[] args){
        int numero = 5;

        System.out.println(numero++);
        System.out.println(numero);

        boolean variavel  = true;

        variavel =  !variavel;
        System.out.println(variavel);
        System.out.println(!variavel);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 > numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        String nomeUm = "Suane";
        String nomeDois = new String("Suane");

        simNao = nomeUm == nomeDois;

        System.out.println("nomeUm é igual a nomeDois? " + simNao);

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("as condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("uma das condições são verdareiras");
        }

        
    }

}
