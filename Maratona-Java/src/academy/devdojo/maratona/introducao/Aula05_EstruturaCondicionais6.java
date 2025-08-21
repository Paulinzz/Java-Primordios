package academy.devdojo.maratona.introducao;

public class Aula05_EstruturaCondicionais6 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerado 1 como domingo
        // Obs: CLT né 6x1 
        byte dia = 1;
        String tipodia = "Final de Semana";
        if(dia != 1){
            tipodia = "Dia Util";
        }
        switch (dia){
            case 1:
                System.out.println("Domingo é "+tipodia);
                break;
            case 2:
                System.out.println("Segunda é "+tipodia);
                break;
            case 3:
                System.out.println("Terca é "+tipodia);
                break;
            case 4:
                System.out.println("Quarta é "+tipodia);
                break;
            case 5:
                System.out.println("Quinta é "+tipodia);
                break;
            case 6:
                System.out.println("Sexta é "+tipodia);
                break;
            case 7:
                System.out.println("Sabado é "+tipodia);
                break;
            default:
                System.out.println("Opcao Invalida");
        }
    }
}
