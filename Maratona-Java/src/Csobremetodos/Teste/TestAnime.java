package Csobremetodos.Teste;

import Csobremetodos.Dominio.Anime;

public class TestAnime {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.SetTip("TV");
        anime.SetEp("274");
        anime.SetNome("Naruto");
        anime.Imprime();
    }
}
