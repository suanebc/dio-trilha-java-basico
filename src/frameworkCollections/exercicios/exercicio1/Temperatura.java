package frameworkCollections.exercicios.exercicio1;



public class Temperatura  {
    private String mes;
    private double temperaturaMedia;


    public Temperatura(String mes, double temperatura) {
        this.mes = mes;
        this.temperaturaMedia = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "mes='" + mes + '\'' +
                ", temperaturaMedia=" + temperaturaMedia +
                '}';
    }

}
