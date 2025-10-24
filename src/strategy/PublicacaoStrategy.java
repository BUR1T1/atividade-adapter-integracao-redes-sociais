package strategy;

import config.*;
import config.Conteudo;

import java.util.List;

public class PublicacaoStrategy {
    public void publicarEmTodas(List<GerenciadorMidiaSocial> redes, Conteudo conteudo) {
        for (GerenciadorMidiaSocial rede : redes) {
            rede.publicar(conteudo);
        }
    }
}
