package factory;

import adapters.*;
import apis.InstagramAPI;
import apis.LinkedInAPI;
import apis.TikTokAPI;
import apis.TwitterAPI;
import config.GerenciadorMidiaSocial;

import java.util.List;

public class SocialMediaFactory {
    public static List<GerenciadorMidiaSocial> criarAdaptadores() {
        return List.of(
                new TwitterAdapter(new TwitterAPI()),
                new InstagramAdapter(new InstagramAPI()),
                new LinkedInAdapter(new LinkedInAPI()),
                new TikTokAdapter(new TikTokAPI())
        );
    }
}
