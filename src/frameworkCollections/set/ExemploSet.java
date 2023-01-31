package frameworkCollections.set;



import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println(notas.toString());
        System.out.println("Confira se existe a nota 5.0" + notas.contains(5));
        System.out.println("exiba a menor nota" + Collections.min(notas));
        System.out.println("exiba a maior nota" + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("média dos valores: " + soma / notas.size());

        System.out.println("Remover: 0 ");
        notas.remove(0d); // não remove por indice
        System.out.println(notas);

        System.out.println("Remover as notas menores que 7 : ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apaguar tudo");
        notas.clear();
        System.out.println(notas);
    }
}