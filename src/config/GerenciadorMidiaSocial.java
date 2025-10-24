package config;

import java.time.LocalDateTime;

public interface GerenciadorMidiaSocial {
    void publicar(Conteudo conteudo);
    void agendar(Conteudo conteudo, LocalDateTime horario);
    Estatisticas consultarEstatisticas(String idPublicacao);
}
