package adapters;

import apis.TikTokAPI;
import config.Conteudo;
import config.Estatisticas;
import config.GerenciadorMidiaSocial;

import java.time.LocalDateTime;

public class TikTokAdapter implements GerenciadorMidiaSocial {

    private final TikTokAPI tiktok;

    public TikTokAdapter(TikTokAPI tiktok){
        this.tiktok = tiktok;
    }

    @Override
    public void publicar(Conteudo conteudo) {
        tiktok.tiktok(conteudo.getTexto());
    }

    @Override
    public void agendar(Conteudo conteudo, LocalDateTime horario) {
        System.out.println("Agendado para: " + horario + " - " + conteudo.getTexto());
    }

    @Override
    public Estatisticas consultarEstatisticas(String idPublicacao) {
        return tiktok.buscarEstatisticas(idPublicacao);
    }
}
