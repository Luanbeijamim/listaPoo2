package interfaces;

public class Peixe implements Navegavel {

    @Override
    public void navegar() {
        System.out.println("O peixe está navegando (nadando) pelos corais do oceano.");
    }
}