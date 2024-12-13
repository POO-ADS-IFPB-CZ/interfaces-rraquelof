package Questao1.view;

import Questao1.model.Triatleta;

public class Main {
    public static void main(String[] args){
        Triatleta triatleta = new Triatleta("Bilu", "1569151", 30);
        triatleta.aquecer();
        triatleta.nadar();
        triatleta.pedalar();
        triatleta.correr();
        System.out.println(triatleta);
    }
}
