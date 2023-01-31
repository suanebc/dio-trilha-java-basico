package frameworkCollections.exercicios.exercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/* Faça um programa que receba a temperatura média dos 6 primieiros
meses do ano e armazene-as em uma lista. Após isto, calcule a média
semestral  das temperaturas e mostre todas as temperaturas acima
desta media, e em que mês elas  ocorreram(mostrar o mês
por extenso: 1 - Janeiro, 2 - Fevereiro e etc).
 */
public class Exercicico1 {




    public static void main(String[] args) {

        List<Temperatura> temperaturasPrimeiroSemestre = new ArrayList<>(){{
            add(new Temperatura("Janeiro", 32.5));
            add(new Temperatura("Fevereiro", 31.5));
            add(new Temperatura("Março", 31.0));
            add(new Temperatura("Abril", 29.5));
            add(new Temperatura("Maio", 29.5));
            add(new Temperatura("Junho", 27.0));

        }};
        /*
        List<Temperatura> temperaturasPSegundoSemestre = new ArrayList<>(){
            {
                add(new Temperatura("Julho", 27.0));
                add(new Temperatura("Agosto", 29.5));
                add(new Temperatura("Setembro", 29.5));
                add(new Temperatura("Outubro", 30.5));
                add(new Temperatura("Novembro", 30.0));
                add(new Temperatura("Dezembro", 31.0));
            }};*/

        Iterator<Temperatura> iterator = temperaturasPrimeiroSemestre.iterator();
        double soma = 0d;
        while(iterator.hasNext()){
            Temperatura next = iterator.next();
            soma += next.getTemperaturaMedia();
        }

        System.out.println("Exiba a soma dos valores: "+ soma);
        double mediaDeTemperatura = soma/temperaturasPrimeiroSemestre.size();
        System.out.printf("Média dos valores %.2f %n",mediaDeTemperatura);
        System.out.println("Meses mais quentes que a media de temperatura:");
        for(Temperatura temperatura:temperaturasPrimeiroSemestre ){
            if(temperatura.getTemperaturaMedia() > mediaDeTemperatura){
                System.out.println(temperatura.getMes() + " = " + temperatura.getTemperaturaMedia());
            }

        }

    }




}
