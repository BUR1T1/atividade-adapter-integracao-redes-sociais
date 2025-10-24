package apis;

import config.Estatisticas;

public class LinkedInAPI {
    public void linked(String texto){
        System.out.println("Publicação de linked");
    }
    public Estatisticas buscarEstatisticas(String idPublicacao) {
        System.out.println("Buscando estatísticas do linked: " + idPublicacao);
        return new Estatisticas(1320, 5, 18); // valores simulados
    }
}
