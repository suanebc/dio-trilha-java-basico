package orientacaoAObjeto.exercicio4;

public class Calculadora implements OperacaoMatematica{

    @Override
    public void somar(double num1, double num2) {
        System.out.println(num1+num2);
    }

    @Override
    public void subtrair(double num1, double num2) {
        System.out.println(num1-num2);

    }

    @Override
    public void multiplicar(double num1, double num2) {
        System.out.println(num1*num2);

    }

    @Override
    public void dividir(double num1, double num2) {
        System.out.println(num1/num2);

    }
}
