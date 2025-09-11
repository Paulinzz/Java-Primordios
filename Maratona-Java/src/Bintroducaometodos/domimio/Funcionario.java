package Bintroducaometodos.domimio;

public class Funcionario {
    private String nome;
    private int idade;
    private double [] salarios;
    private double media;


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
        if (salarios == null){
            return;
        }
            for (double i : salarios) {
                media += i;
            }
            media = media / salarios.length;
            System.out.println("\nMedia Salarial " + media);
        }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSalarios(double [] salarios){
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double getMedia(){
        return media;
    }

    public double [] getSalarios(){
        return salarios;
    }

}
