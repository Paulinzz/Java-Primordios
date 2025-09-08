package Bintroducaometodos.teste;

import Bintroducaometodos.domimio.Estudante;
import Bintroducaometodos.domimio.ImpressoraEstudantil;

public class Estudantetest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudantil impressoraEstudantil = new ImpressoraEstudantil();

        estudante01.nome = "Pikachu";
        estudante01.idade = 30;
        estudante01.sexo = 'M';

        estudante02.nome = "Charizard";
        estudante02.idade = 28;
        estudante02.sexo = 'M';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);
        System.out.println("------------");
        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);

        // utilizando parametros de referencia

        impressoraEstudantil.imprime(estudante02); // nome: charizad
        System.out.println("------------");

        // alterando o objeto na classe
        impressoraEstudantil.imprime(estudante02); // nome: Gohan

    }
}
