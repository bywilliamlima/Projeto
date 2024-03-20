
import java.util.concurrent.ThreadLocalRandom;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PROFESSORA
 */
public class ProcessoSeletivo {
    public static void main(String[] args) {
      selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "Luiz", "William", "Antonio", "Adan", "Vinicius", "Leandro", "Claudio", "Bruno",
                "Marcio", "Breno" };
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("o Candidato :" + candidato + " Solicitou Esse valor de Salario :" + salarioPretendido);
                analisarCandidato(salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O Candidato :" + candidato + " foi selecionado para vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar Para o Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar Para Candidato Com Contra Proposta");
        } else {
            System.out.println("Aguardando o Resultado Demais Candidatos ");
        }
    }

}

    

