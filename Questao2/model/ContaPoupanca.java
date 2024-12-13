package Questao2.model;

public class ContaPoupanca extends Conta implements Investimento{

    public ContaPoupanca(int numero, String nome_titular, double saldo) {
        super(numero, nome_titular, saldo);
    }

    @Override
    public void imprimirTipoConta(){
        System.out.println("Conta Poupança");
    }

    @Override
    public void reajustar(double percentual) {
        saldo += saldo * percentual;
    }
}
