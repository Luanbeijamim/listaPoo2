package wrappers;

public class Exercicio01 {

    public void executar() {
        int nota = 8;
        Integer notaObj = nota;

        System.out.println("Valor de nota (int): " + nota);
        System.out.println("Valor de notaObj (Integer): " + notaObj);
        System.out.println("Tipo de notaObj: " + notaObj.getClass().getSimpleName());
    }
}