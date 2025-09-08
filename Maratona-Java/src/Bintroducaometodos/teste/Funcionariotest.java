package Bintroducaometodos.teste;

import Bintroducaometodos.domimio.Funcionario;

public class Funcionariotest {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.nome  = "Joao";
        funcionario01.idade = 30;
        funcionario01.salarios = new double[]{1500,5000,20000};

        funcionario01.ImprimiDados();
        funcionario01.MediaSalarial();

    }
}
