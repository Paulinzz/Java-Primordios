package Bintroducaometodos.domimio;

public class Funcionario {
    public String nome;
    public int idade;
    public double [] salarios;

    public void ImprimiDados(){
        System.out.println("----------------");
        System.out.println("Meu nome: "+ this.nome);
        System.out.println("Minha idade: "+ this.idade);
        for ( double salario : salarios){
            System.out.println("Meu salario: "+ salario);

        }
    }

    public void MediaSalarial() {
        System.out.println("----------- Media Salarial ------------");
        double media = 0;
        if (salarios == null){
            return;
        }
            for (double i : salarios) {
                media += i;
            }
            media = media / salarios.length;
            System.out.println("\nMedia Salarial " + media);

        }

}
