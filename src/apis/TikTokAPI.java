package apis;

import config.Estatisticas;

public class TikTokAPI {

    public void tiktok(String texto){
        System.out.println("Publicação de tiktok");
    }
    public Estatisticas buscarEstatisticas(String idPublicacao) {
        System.out.println("Buscando estatísticas do tiktok: " + idPublicacao);
        return new Estatisticas(10, 65, 318); // valores simulados
    }
}
