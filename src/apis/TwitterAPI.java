package apis;

import config.Estatisticas;

public class TwitterAPI {

    public void tweetar(String texto) {
        System.out.println("Nova publicação do Twitter");
    }

    public Estatisticas buscarEstatisticas(String idPublicacao) {
        System.out.println("Buscando estatísticas do tweet: " + idPublicacao);
        return new Estatisticas(896, 65, 32);
    }

}
