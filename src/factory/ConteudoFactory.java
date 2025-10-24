package factory;

import config.Conteudo;


public class ConteudoFactory {
    public static Conteudo gerarPara(String plataforma) {
        switch (plataforma.toLowerCase()) {
            case "twitter": return new Conteudo("Tweet rápido: confira isso!");
            case "instagram": return new Conteudo("Nova foto no feed 📸");
            case "linkedin": return new Conteudo("Dica profissional para sua carreira");
            case "tiktok": return new Conteudo("Vídeo novo no ar 🎥");
            default: return new Conteudo("Publicação genérica");
        }
    }
}
