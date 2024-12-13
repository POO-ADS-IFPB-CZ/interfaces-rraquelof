package Questao1.model;

public class Triatleta extends Pessoa implements Nadador, Ciclista, Corredor{

    public Triatleta(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }

    @Override
    public void pedalar() {
        System.out.println(this.getNome() + " está pedalando.");
    }

    @Override
    public void correr() {
        System.out.println(this.getNome() + " está correndo.");
    }

    @Override
    public void nadar() {
        System.out.println(this.getNome() + " está nadando.");
    }

    @Override
    public void aquecer() {
        System.out.println(this.getNome() + " está aquecendo.");
    }
}
