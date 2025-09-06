package javacore.introducaoclasses.teste;

import javacore.introducaoclasses.dominio.Carro;

public class Carrotest {
    public static void main(String[] args) {

        Carro carro01 = new Carro();
        carro01.nome = "Corolla";
        carro01.ano = 2017;
        carro01.modelo = "Turbo - 2.0";

        System.out.println("Nome " + carro01.nome + " Ano " + carro01.ano+ " Modelo " + carro01.modelo);

        Carro carro02 = new Carro();
        carro02.nome = "Ford Ranger";
        carro02.ano = 2023;
        carro02.modelo = "Hibrido, flex 2.4";

        System.out.println("Nome " + carro02.nome + " Ano " + carro02.ano+ " Modelo " + carro02.modelo);

        carro02 = carro01; //referencia de objetos 

    }
}
