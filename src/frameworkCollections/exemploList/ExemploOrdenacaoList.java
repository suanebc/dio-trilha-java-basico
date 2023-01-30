package frameworkCollections.exemploList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Dados as seguintes informações sobre meus gatos, crie uma lista e ordene esta lista exibindo:
nome - idade - cor
*/
public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 2, "trigrado"));
            add(new Gato("Jon", 6, "amarelo"));
        }};

        System.out.println("Ordem de inserção");
        System.out.println(meusGatos);

        System.out.println("Ordem aleatória");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural (nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem Idade");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Ordem Cor");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem Nome/Cor/Idade");
        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}
