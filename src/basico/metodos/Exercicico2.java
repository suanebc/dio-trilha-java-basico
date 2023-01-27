package metodos;

import java.util.Calendar;
import java.util.Date;

public class Exercicico2 {

    public static void dataDeHoje() {
        Date data = new Date();
        System.out.println("Data Agora: " + data);

    }

    public static void calendario(String nome) {
        Calendar c1 = Calendar.getInstance();
        int hora = c1.get(Calendar.HOUR_OF_DAY);

        if (hora > 6 && hora < 12) {
            System.out.println("Bom Dia " + nome + " !");
        } else if (hora > 12 && hora < 18) {
            System.out.println("Boa Tarde " + nome + " !");
        } else {
            System.out.println("Boa Noite " + nome + " !");
        }
    }

}

