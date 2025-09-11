package Bintroducaometodos.teste;

import Bintroducaometodos.domimio.Funcionario;

public class Funcionariotest {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("Joao");
        funcionario01.setIdade(30);
        funcionario01.setSalarios(new double[]{1500,5000,20000});

        funcionario01.ImprimiDados();
        funcionario01.MediaSalarial();

    }
}
