package modularizacao.core;

import modularizacao.utils.operacao.Calculadora;


public class Runner {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(50, 50));
        System.out.println(calculadora.sub(50, 30));
        System.out.println(calculadora.div(50, 5));
        System.out.println(calculadora.multi(30, 3));
    }
}
