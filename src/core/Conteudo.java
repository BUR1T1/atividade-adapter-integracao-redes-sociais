package core;

public class Conteudo {
    private String texto;
    private String imageUrl;

    public Conteudo(String texto, String imageUrl){
        this.imageUrl = imageUrl;
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
