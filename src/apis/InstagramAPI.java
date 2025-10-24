package apis;

import config.Estatisticas;

public class InstagramAPI {
    public void insta(String texto){
        System.out.println("Publicação de intagra");
    }
    public Estatisticas buscarEstatisticas(String idPublicacao) {
        System.out.println("Buscando estatísticas do instagran: " + idPublicacao);
        return new Estatisticas(330, 85, 10); // valores simulados
    }


}
