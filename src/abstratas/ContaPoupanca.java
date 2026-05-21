package abstratas;

public class ContaPoupanca extends Conta {

    @Override
    public void sacar(double valor) {
        /*A conta poupança é estrita: só permite o saque se o valor solicitadofor menor ou igual ao saldo disponível em conta.*/
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("[ALERTA] Saque recusado na Poupança: Saldo insuficiente!");
        }
    }
}