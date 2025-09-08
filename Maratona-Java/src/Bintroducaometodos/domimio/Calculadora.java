package Bintroducaometodos.domimio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(10-10);
    }

    public void mutiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    // Methods Return

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    // dando retorno com metodo void
    public void ImprimeDiivsaoDeDoisNumeros(int num1, int num2){
        if(num2 == 0 ){
            System.out.println("Impossivel realizar divisao, denominador = 0 ");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumbers(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumbers");
        System.out.println(num1);
        System.out.println(num2);
    }

    public void somaArrays(int [] numbers){
        int soma = 0;
        for(int num : numbers){
           soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int ... numeros){
        int soma = 0;
        for(int num : numeros){
           soma += num;
        }
        System.out.println(soma);
    }
}
