package interfaces;

public class Contrato implements Imprimivel {

    @Override
    public void imprimir() {
        System.out.println("[IMPRIMINDO] Emitindo vias do Contrato de Prestação de Serviços...");
    }
}