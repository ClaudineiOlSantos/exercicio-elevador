package exercicio.elevador;

import exercicio.elevador.Elevador;
import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
        int opcao = 0;

        do {

            System.out.println("|------------------------------|");
            System.out.println("|***Escolha a opção desejada***|");
            System.out.println("|------------------------------|");
            System.out.println("|1 - Adicionar pessoas         |");
            System.out.println("|2 - Remover pessoas           |");
            System.out.println("|3 - subir                     |");
            System.out.println("|4 - descer                    |");
            System.out.println("|------------------------------|");

            System.out.println("O que deseja fazer?");
            opcao = (input.nextInt());

            switch (opcao) {
                case 1:
                    System.out.println("Informe a quantidade de pessoas vão entrar no elevador.");
                    e.entra(input.nextInt());
                    break;
                case 2:
                    System.out.println("Informe a quantidade de pessoas vão sair do elevador.");
                    e.sai(input.nextInt());
                    break;
                case 3:
                    System.out.println("Informe qual o andar.");
                    e.sobe(input.nextInt());
                    break;
                case 4:
                    System.out.println("Informe qual o andar.");
                    e.desce(input.nextInt());
                    break;
                case 0:
                    opcao = 0;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }

}
