package strategy;

import config.Conteudo;
import config.GerenciadorMidiaSocial;

import java.time.LocalDateTime;
import java.util.List;

public class AgendamentoStrategy {
    public void agendarTodas(List<GerenciadorMidiaSocial> redes, Conteudo conteudo, LocalDateTime horario) {
        for (GerenciadorMidiaSocial rede : redes) {
            rede.agendar(conteudo, horario);
        }
    }
}
