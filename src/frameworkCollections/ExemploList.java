package frameworkCollections;



import java.lang.reflect.Array;
import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        List<Double> notas1 = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6 );// não dá p add ou remover
        List<Double> notas2 = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6 ); // é imútavel também mas tem mais métodos
        ArrayList<Double> notas3 = new ArrayList<>();
        notas3.add(7d);
        notas3.add(8.5);
        notas3.add(9.3);
        notas3.add(4.5);
        notas3.add(1.5);
        notas3.add(5d);
        notas3.add(1d);
        notas3.add(7, 8d);
        notas3.set(notas3.indexOf(5d), 6d);

        System.out.println(notas3.toString());
        System.out.println("A nota 5.0 existe na lista ?"+notas3.contains(5d));
        for(Double nota : notas3) System.out.println(nota);
        System.out.println("terceira nota adicionada: " + notas3.get(2));

        System.out.println("Exibir a menor nota usando Collections "+ Collections.min(notas3));
        System.out.println("Exibir a maior nota usando Collections "+ Collections.max(notas3));

        Iterator<Double> iterator = notas3.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: "+ soma);
        System.out.println("Média dos valores "+ (soma/notas3.size()));

        notas3.remove(1d);
        notas3.remove(0);
        System.out.println(notas3);

        System.out.println("Removendo as notas menores que 7 ");
        Iterator<Double> iterator1 = notas3.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();

        }
        System.out.println(notas3);
        //apagar toda a lista;
        notas3.clear();
        System.out.println(notas3);
        System.out.println(notas3.isEmpty());
    }
}
