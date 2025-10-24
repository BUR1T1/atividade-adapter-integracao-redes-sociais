package adapters;

// TwitterAdapter.java
public class TwitterAdapter implements GerenciadorMidiaSocial {
    private final TwitterAPI twitter;

    public TwitterAdapter(TwitterAPI twitter) {
        this.twitter = twitter;
    }

    @Override
    public void publicar(Conteudo conteudo) {
        twitter.tweetar(conteudo.getTexto());
    }

    @Override
    public void agendar(Conteudo conteudo, LocalDateTime horario) {
        System.out.println("Agendado para: " + horario + " - " + conteudo.getTexto());
    }

    @Override
    public Estatisticas consultarEstatisticas(String idPublicacao) {
        return twitter.buscarEstatisticas(idPublicacao);
    }
}

