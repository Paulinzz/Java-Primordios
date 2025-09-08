package Bintroducaometodos.teste;

import Bintroducaometodos.domimio.Estudante;
import Bintroducaometodos.domimio.ImpressoraEstudantil;

public class Estudantetest2 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Pikachu";
        estudante01.idade = 30;
        estudante01.sexo = 'M';

        estudante02.nome = "Charizard";
        estudante02.idade = 28;
        estudante02.sexo = 'M';

        estudante02.imprime();
        estudante01.imprime();
    }
}
