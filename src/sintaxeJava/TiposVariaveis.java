package sintaxeJava;

public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2.5;

        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
        float pi = 3.14F;
        double salario = 1275.33;

        //Observe que o tipo long precisa terminar com L, o tipo float precisa terminar
        // com F e alguns cenários do dia-a-dia, podem estimular uma alteração de tipos de dados convencional.


        // TiposEVariaveis.java

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Variaveis X Constantes
        int numero = 5;
        numero = 10;
        final String DIADASEMANA = "Segunda-feira";



    }
}