package exercicio.elevador;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author claudinei
 */
public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador(int totalAndares, int capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;

        this.andarAtual = 1;
        this.pessoasPresentes = 0;

    }

    public void entra(int qtdPessoas) {
        if (this.pessoasPresentes + qtdPessoas <= this.capacidade) {
            this.pessoasPresentes += qtdPessoas;
             System.out.println("Entra "+qtdPessoas+" pessoas");
        }
        System.out.println(this.toString());
    }

    public void sai(int qtdPessoas) {
        if (this.pessoasPresentes - qtdPessoas >= 0) {
            this.pessoasPresentes -= qtdPessoas;
            System.out.println("Sai "+qtdPessoas+" pessoas");
        }
         System.out.println(this.toString());
    }

    public void sobe(int andar) {
        if (this.andarAtual < andar) {
            for (int c = this.andarAtual; c < andar; c++) {
                this.andarAtual++;
                System.out.println("Subindo..." + this.andarAtual);

            }
        }
         System.out.println(this.toString());
    }

    public void desce(int andar) {
        if (this.andarAtual > andar) {
           for (int c = this.andarAtual; c > andar; c--) {
                this.andarAtual--;
                System.out.println("Descendo..." + this.andarAtual);
            }
        }
         System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Elevador{" + "andarAtual=" + andarAtual + ", totalAndares=" + totalAndares + ", capacidade=" + capacidade + ", pessoasPresentes=" + pessoasPresentes + '}';
    }
    
    

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

}
