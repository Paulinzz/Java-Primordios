package Bintroducaometodos.teste;

import Bintroducaometodos.domimio.Pessoa;

public class Pessoatest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        // pessoa.nome = "Jiraya";
        pessoa.setNome("Jiraya");
        pessoa.setIdade(59);
        // pessoa.idade = 59;
        //pessoa.imprime();


        // utilizando get para consulta o objeto
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
