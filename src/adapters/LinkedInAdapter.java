package adapters;

import apis.LinkedInAPI;
import config.GerenciadorMidiaSocial;
import config.Conteudo;
import config.Estatisticas;

import java.time.LocalDateTime;

public class LinkedInAdapter implements GerenciadorMidiaSocial {

    private final LinkedInAPI linked;

    public LinkedInAdapter(LinkedInAPI linked){
        this.linked = linked;
    }

    @Override
    public void publicar(Conteudo conteudo) {
        linked.linked(conteudo.getTexto());
    }

    @Override
    public void agendar(Conteudo conteudo, LocalDateTime horario) {
        System.out.println("Agendado para: " + horario + " - " + conteudo.getTexto());
    }

    @Override
    public Estatisticas consultarEstatisticas(String idPublicacao) {
        return linked.buscarEstatisticas(idPublicacao);
    }

}
