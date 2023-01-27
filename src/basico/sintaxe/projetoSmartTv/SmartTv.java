package basico.condicionalEControleDeFluxo.sintaxeJava.projetoSmartTv;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanal(int canal) {
        this.canal = canal;
    }
    public void mudarCanal() {
        canal++;
    }


}