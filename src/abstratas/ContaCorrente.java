package abstratas;

public class ContaCorrente extends Conta {

    @Override
    public void sacar(double valor) {
        /* conta corrente permite que o saldo fique negativo (uso do cheque especial).
        Por isso, não fazemos nenhuma validação impeditiva, apenas subtraímos.*/
        this.saldo -= valor;
    }
}