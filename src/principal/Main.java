package principal;

import interfaces.Imprimivel;
import interfaces.Contrato;
import interfaces.Relatorio;

public class Main {

    public static void main(String[] args) {

        Contrato meuContrato = new Contrato();
        Relatorio meuRelatorio = new Relatorio();


        imprimirDocumento(meuContrato);
        imprimirDocumento(meuRelatorio);
    }

    /* O método estático recebe o tipo da interface como parâmetro, permitindo
       que qualquer classe compatível com o contrato seja processada. */
    public static void imprimirDocumento(Imprimivel doc) {
        /* A chamada do método é resolvida dinamicamente com base na
           implementação real do objeto passado. */
        doc.imprimir();
    }
}