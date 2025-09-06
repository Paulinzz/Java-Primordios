package javacore.introducaoclasses.teste;

import javacore.introducaoclasses.dominio.Professor;

public class Professortest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "romerito";
        professor.idade = 32;
        professor.sexo = 'M';

        System.out.println("Idade " + professor.idade + " Nome " + professor.nome+ " Sexo " + professor.sexo);
    }
}
