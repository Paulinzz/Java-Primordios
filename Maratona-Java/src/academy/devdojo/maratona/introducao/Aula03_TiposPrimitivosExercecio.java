package academy.devdojo.maratona.introducao;

/*
    Pratica:
    Crie variaveis para os campos abaixo e imprime a seguinte mensagem

    eu <nome> morando no <endereco>
    confirmo que recebi o salario <salario> na data <data>
 */

public class Aula03_TiposPrimitivosExercecio {
    public static void main (String[] args) {
        String nome =  "Joao";
        String endereco = "Rua Dos Fundos";
        float salario = 2500F;
        String data_salario = "19-08-25";
        String relatorio = "eu "+nome+" morando no "+endereco+" confirmo que recebi o salario "+salario+" na data "+data_salario;
        System.out.println(relatorio);
    }
}
