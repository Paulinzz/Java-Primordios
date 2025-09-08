package Bintroducaometodos.teste;

import Bintroducaometodos.domimio.Calculadora;

public class Calculadoratest4 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArrays(numeros);
        calculadora.somaVarArgs(1,2,3,4); // vantangem de utilizar numeros "normais" do que instanciam em uma array
    }
}
