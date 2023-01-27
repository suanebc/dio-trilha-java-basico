package orientacaoAObjeto.exercicio1;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.setCor("Preto");
        meuCarro.setModelo("BMW séria 3");
        meuCarro.setCapacidadeTanque(59);

        System.out.println("Meu carro...");
        System.out.println("Cor: "+meuCarro.getCor() + " Modelo: " + meuCarro.getModelo() + " Capacidade do Tanque:"
                + meuCarro.getCapacidadeTanque());

        Carro outroCarro = new Carro("Azul", "Celta Ls_2p", 54 );

        System.out.println("Outro carro...");
        System.out.println("Cor: "+meuCarro.getCor() + " Modelo: " + meuCarro.getModelo() + " Capacidade do Tanque:"
                + meuCarro.getCapacidadeTanque());


    }
}
