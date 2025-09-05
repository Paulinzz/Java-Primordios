package javacore.introducaoclasses.teste;

import javacore.introducaoclasses.dominio.Estudante;

public class Estudantetest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 16;
        estudante.sexo = 'M';
        estudante.nome = "Joao Paulo";

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);


    }
}
