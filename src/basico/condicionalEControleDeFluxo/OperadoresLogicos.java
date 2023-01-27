package basico.condicionalEControleDeFluxo;

public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;
        System.out.println("b1 && b2 = "+ (b1 && b2));
        System.out.println("b1 && b3 = "+ (b1 && b2));

        System.out.println("b2 || b3 = "+ (b2 || b3));
        System.out.println("b2 || b4 = "+ (b2 || b4));

        System.out.println("b1 ^ b2 = "+ (b1 ^ b2));
        System.out.println("b1 ^ b2 = "+ (b4 ^ b1));

        System.out.println("negação de b1 = "+ (!b1));
        System.out.println("negação de b2 = "+ (!b2));

        System.out.println(" ");

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50.5f;

        System.out.println("(i1 + i2) < (f2 - f1) && true = "+((i1 + i2) < (f2 - f1) && true));
        System.out.println("(i1 + i2) > (f2 - f1) && true = "+((i1 + i2) > (f2 - f1) && true));

        double salarioMensal = 11893.58d;
        double mediaSalarial = 11893.58d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalarial) && (quantidadeDependentes >= 6));
    }

}
