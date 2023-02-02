package frameworkCollections.set.exercicios;

import java.util.*;

/*
crie um conjunto com as cores do arco-íris:
1. exiba todas as cores, uma abaixo da outra
2. a quantidade de cores
3. exiba as cores em ordem alfabética
4. exiba as cores na ordem inversa
5. exiba todas as cores que começam com a letra "v"
6. rmova todas as cores que não começãm com a letra "v"
7. limpe o conjunto
8. confira se o conjunto está vazio
 */
public class ExercicioSet1 {


    public static void main(String[] args) {
        Set<String> cores = new HashSet<>(Arrays.asList(
                "vermelho",
                "laranja",
                "amarelo",
                "verde",
                "azul",
                "anil",
                "violeta"
        ));

        System.out.println("Cores do arco-íris:");
        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()){
            String cor = iterator.next();
            System.out.println(cor);
        }
        System.out.println("quantidade de cores: "+cores.size());
         Set<String> coresEmOrdemAlfabetica = new TreeSet<>(cores);
        System.out.println("em ordem alfabetica: "+coresEmOrdemAlfabetica);
        List<String> coresArcoIris3 = new ArrayList<>(cores);
        Collections.reverse((List<?>) coresArcoIris3);
        System.out.println("ordem inversa: "+coresArcoIris3);

        System.out.println("cores que começam com a letra ”v”: ");
        for (String cor: cores) {
            if(cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("remover cores que não começam com v ");
        Iterator<String> iterator1 = cores.iterator();
        while (iterator1.hasNext()){
            if(!iterator1.next().startsWith("v")) iterator1.remove();
        }
        System.out.println(cores);

        System.out.println("Limpe o conjunto: ");
        cores.clear();

        System.out.println("Confira se o conjunto está vazio: " + cores.isEmpty());
    }
}
