package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("---- Processo Seletivo ----");
        System.out.println("  ");

        selecaoCandidatos();
        imprimirSelcionados();
    }

    static void imprimirSelcionados(){
        String [] candidatos = {"Felipe", "Márcia","Júlia","Paulo","Augusto"};
        System.out.println("Imprimindo a lista de candidatos, informando o índice do elemento");
        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Márcia","Júlia","Paulo","Augusto","Mônica","Fabrício","Mirela","Daniela","Jordânia"};
        
        
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }else
                System.out.println("O candidato " + candidato + " NÃO foi selecionado.");
            candidatosAtual++;
        }   

    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato.");
        }else if(salarioBase==salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta.");
        else {
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }

    }

    
}
