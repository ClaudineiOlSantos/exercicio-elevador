package exercicio.elevador;

import exercicio.elevador.Elevador;

/**
 *
 * @author claudinei
 */
public class ExercicioElevador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Elevador e = new Elevador(10, 10);

        e.entra(10);
        e.sobe(5);
        e.sai(5);
        e.sobe(10);
        e.sai(5);
        e.entra(2);
        e.desce(1);
        e.sai(2);
    }

}
