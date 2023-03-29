package edu.java.aula01;

public class AnatomiaClasses {
    public static void main(String[] args) throws Exception {
        int anoFabricacao = 2023;
        final String BR = "Brasil";
        final double PI = 3.14;
        int idade = 36;
        double altura = 1.83;
        String primeiroNome = "Ramisés";
        String segundoNome = "Reis";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println("Aprendendo Java na DIO");
        System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto(String primeirNome, String segundoNome){
        return "Resultado do método: " +  primeirNome.concat(" ").concat(segundoNome);
    


        /*Declarar uma variável em Java sempre segue a seguinte estrutura:
        tipo nomeBemDefinido = atribuicao (opcional em alguns casos)
        */
        
        
    }
}
