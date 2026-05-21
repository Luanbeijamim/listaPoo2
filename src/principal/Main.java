package principal;

import abstratas.ContaCorrente;
import abstratas.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(100.0);
        cc.sacar(150.0); // Deve permitir e deixar o saldo em -50.0

        System.out.println("--- Saldo Conta Corrente ---");
        System.out.println("Saldo atual: R$ " + cc.getSaldo());


        ContaPoupanca poupanca = new ContaPoupanca();
        poupanca.depositar(100.0);
        poupanca.sacar(150.0); // Deve recusar e exibir a mensagem de erro

        System.out.println("--- Saldo Conta Poupança ---");
        System.out.println("Saldo atual: R$ " + poupanca.getSaldo());
    }
}