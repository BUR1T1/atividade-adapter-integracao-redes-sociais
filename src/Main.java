import adapters.InstagramAdapter;
import adapters.LinkedInAdapter;
import adapters.TikTokAdapter;
import adapters.TwitterAdapter;
import apis.InstagramAPI;
import apis.LinkedInAPI;
import apis.TikTokAPI;
import apis.TwitterAPI;
import config.Conteudo;
import config.Estatisticas;
import config.GerenciadorMidiaSocial;
import core.RespostaMidiaSocial;
import factory.ConteudoFactory;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Conteudo twitterConteudo = ConteudoFactory.gerarPara("twitter");
      /*Conteudo instagramConteudo = ConteudoFactory.gerarPara("instagram");
        Conteudo linkedinConteudo = ConteudoFactory.gerarPara("linkedin");
        Conteudo tiktokConteudo = ConteudoFactory.gerarPara("tiktok");*/

        GerenciadorMidiaSocial twitter = new TwitterAdapter(new TwitterAPI());
     /* GerenciadorMidiaSocial instagram = new InstagramAdapter(new InstagramAPI());
        GerenciadorMidiaSocial linkedin = new LinkedInAdapter(new LinkedInAPI());
        GerenciadorMidiaSocial tiktok = new TikTokAdapter(new TikTokAPI());*/

        // Publicação individual
        twitter.publicar(twitterConteudo);
      /*instagram.publicar(instagramConteudo);
        linkedin.publicar(linkedinConteudo);
        tiktok.publicar(tiktokConteudo);
*/
        LocalDateTime horario = LocalDateTime.now().plusHours(2);
        twitter.agendar(twitterConteudo, horario);
   /*   instagram.agendar(instagramConteudo, horario);
        linkedin.agendar(linkedinConteudo, horario);
        tiktok.agendar(tiktokConteudo, horario);*/

        // Estatísticas
        RespostaMidiaSocial middleware = new RespostaMidiaSocial();
        for (GerenciadorMidiaSocial rede : List.of(twitter/*, instagram, linkedin, tiktok*/)) {
            Estatisticas stats = rede.consultarEstatisticas("post123");
            middleware.processar(stats);
        }
    }
}
