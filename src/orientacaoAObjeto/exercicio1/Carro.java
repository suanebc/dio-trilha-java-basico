package orientacaoAObjeto.exercicio1;

public class Carro {
    private String cor;
    private String modelo;
    private int capacidadeTanque;

    public Carro() {
    }

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) { // set - setar um atributo - colocar
        this.cor = cor;
    }

    public String getModelo() { // get - pegar ou devolver um atributo
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double totalValorTanque(double valor){
        return capacidadeTanque * valor;
    }



}
