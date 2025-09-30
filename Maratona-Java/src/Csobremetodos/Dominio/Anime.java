package Csobremetodos.Dominio;

public class Anime {
    private String tip;
    private String Ep;
    private String Nome;

    public void Imprime(){
        System.out.println(this.Ep);
        System.out.println(this.tip);
        System.out.println(this.Nome);
    }

    public void SetNome (String Nome){
        this.Nome = Nome;
    }

    public String getNome(){
        return this.Nome;
    }

    public void SetTip (String tip){
        this.tip = tip;
    }

    public String getTip(){
        return this.tip;
    }

    public void SetEp (String Ep) {
        this.Ep = Ep;

    }
    public String getEp(){
        return this.Ep;
    }
}
