package Bintroducaometodos.teste;

import Bintroducaometodos.domimio.Calculadora;

public class calculadoratest2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
    }
}
