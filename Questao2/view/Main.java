package Questao2.view;

import Questao2.model.ContaPoupanca;

public class Main {
    public static void main(String[] args){
        ContaPoupanca contaPoupanca = new ContaPoupanca(99,"Fred", 4000);
        System.out.println("Saldo inicial: "+ contaPoupanca.getSaldo());
        contaPoupanca.reajustar(0.12);
        System.out.println("Saldo após reajuste: "+contaPoupanca.getSaldo());
    }
}
