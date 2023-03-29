package edu.java.aula05;

public class Comentarios {
    public static void main(String[] args) {
        // Olá, eu sou um comentário em uma única linha.

        /* Olá,
         * Eu sou um comentário
         * que posso ser mais detalhado
         * quando necessário. 
         */

    }
    /**
     * Essas duas estrelinhas acima
     * é para identificar que você 
     * pretende elaborar um comentário
     * a nívl de documntação.
     * Que incrível !!
     */
    public void metodo(){}

    // Um comentário, não possui a finalidade de amenizar um 
    // algoritmo não estruturado, conforme as convenções da linguagem.

/*
 * Este método foi elaborado as pressas
 * por isso eu abrevei o nome das variáveis
 * mas olha, ele tem a finalidade de somar ou  multiplicar
 * dois números
 */
    public int somaMultiplica (int n, int x, String m){ // método soma ou multiplica?
        int r = 0; // r é igual ao resultado - porque não usar variavel resultado?
        if (m == "M"){ // M= multiplicação
            r= n * x;
        }else{
            // se não soma mesmo
            r = n + x;
        }
        return r;
}

}

