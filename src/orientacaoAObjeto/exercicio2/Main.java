package basico.exercicio2;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        //Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();


        //Downcast
        //endedor vendedor_ = (Vendedor) new Funcionario();


        Mae[] classes = new Mae[]{new FilhaUm(), new FilhaDois(), new Mae()};

        for(Mae classe : classes) classe.metodoUm();
        System.out.println(" ");
        for(Mae classe : classes) classe.metodoDois();

    }

}
