package Csobremetodos.Teste;

import Csobremetodos.Dominio.Anime;

public class TestAnime {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive","TV", 12,"Ação");
        anime.imprime();
    }
}
