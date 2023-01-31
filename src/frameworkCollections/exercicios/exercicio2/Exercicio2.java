package frameworkCollections.exercicios.exercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* Utilizando listas, faça um programa que faça
5 perguntas para uma pessoa sobre um crime.
As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela
deve ser classificada como "suspeita", entre 3 e 4
como "Cúmplice" e 5 como "Assassina"Caso contrário,
ela será classificada como "Inocente".
 */
public class Exercicio2 {
    public static void main(String[] args) {

        ArrayList<String> questionarioInvestigativo = new ArrayList<>(List.of(new String[]{
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?",
        }));

        List<String> respostas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        for(int i = 0; i< 5; i++){
            System.out.println(i+1+". "+questionarioInvestigativo.get(i));
            String resposta = sc.next();
            respostas.add(i, resposta);

        }

        int sim = 0;
        Iterator<String> repostaSim = respostas.iterator();
        while (repostaSim.hasNext()){
            String resposta = repostaSim.next();
            if(resposta.contains("sim")){
                sim++;
            }
        }

         switch (sim) {
             case 2:
                 System.out.println("Você é Suspeito ");
                 break;
             case 3:
                 System.out.println("Você é Cúmplice");
                 break;
             case 4:
                 System.out.println("Você é Cúmplice");
                 break;
             case 5:
                 System.out.println("Você é Assassino");
                 break;
             default:
                 System.out.println("Você é Inocente");

         }

        System.out.println("respostas: "+ respostas + "\n quantidades de sim: " + sim);


    }

}
