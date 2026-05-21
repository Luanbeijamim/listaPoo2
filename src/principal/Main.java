package principal;

import interfaces.Contrato;
import interfaces.Relatorio;

public class Main {

    public static void main(String[] args) {

        Relatorio relatorio = new Relatorio();
        Contrato contrato = new Contrato();

        System.out.println("--- Testando as Implementações da Interface ---");
        relatorio.imprimir(); // Executa a lógica de impressão específica do relatório.
        contrato.imprimir();  // Executa a lógica de impressão específica do contrato.

        /* Interfaces viabilizam o desacoplamento de código. Diferente da herança simples,
           uma única classe pode implementar múltiplas interfaces simultaneamente. */
    }
}