package Bintroducaometodos.teste;

import Bintroducaometodos.domimio.Calculadora;

public class calculadoratest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();

        // Mexendo com Parametros
        calculadora.mutiplicaDoisNumeros(2,4);
        System.out.println("finalizando calc");

    }
}


