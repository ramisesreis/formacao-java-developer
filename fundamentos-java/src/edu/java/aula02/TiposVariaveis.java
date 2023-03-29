package edu.java.aula02;
public class TiposVariaveis {
    public static void main(String[] args) {
        String nome = "Ramisés";
        int idade = 36;
        double peso = 89.5;
        char sexo = 'M';
        double salarioMinimo = 2500.00;
        boolean doadorOrgao = true;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;
        numero = 2;

        System.out.println(numero);

        final double PI = 3.14; //final + nome da variável em caixa alta.
                 
    }

}
