package estruturasDeRepeticaoEArrays.exercicio.arrays;

public class Exercicio1 {
    public static void main(String[] args) {
        int[] vetor = {-1, 5, 7, 23, 50, 8, 0};
        int count = 0;
        System.out.println("Vetor: ");
        while (count < (vetor.length-1)){
            System.out.print(vetor[count]+", ");
            count++;
        }

        System.out.println("\nVeto invertido: ");
        for(int i = (vetor.length-1); i >= 0; i--){

            System.out.print(vetor[i]+", ");

        }
    }
}
