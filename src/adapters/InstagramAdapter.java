package adapters;

import apis.InstagramAPI;
import config.GerenciadorMidiaSocial;
import config.Conteudo;
import config.Estatisticas;

import java.time.LocalDateTime;

public class InstagramAdapter implements GerenciadorMidiaSocial {

    private final InstagramAPI insta;

    public InstagramAdapter(InstagramAPI insta){
        this.insta = insta;
    }

    @Override
    public void publicar(Conteudo conteudo) {
        insta.insta(conteudo.getTexto());
    }

    @Override
    public void agendar(Conteudo conteudo, LocalDateTime horario) {
        System.out.println("Agendado para: " + horario + " - " + conteudo.getTexto());
    }

    @Override
    public Estatisticas consultarEstatisticas(String idPublicacao) {
        return insta.buscarEstatisticas(idPublicacao);
    }
}
