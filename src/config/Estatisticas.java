package config;

import java.util.Random;

public class Estatisticas {
    private int likes;
    private int compartilhamentos;
    private int comentarios;

    public Estatisticas(int likes, int compartilhamentos, int comentarios) {
        Random random = new Random();
        this.likes = random.nextInt(500);
        this.compartilhamentos = random.nextInt(200);
        this.comentarios = random.nextInt(300);
    }

    public int getLikes() { return likes; }
    public int getCompartilhamentos() { return compartilhamentos; }
    public int getComentarios() { return comentarios; }

    @Override
    public String toString() {
        return "Likes: " + likes + ", \nCompartilhamentos: " + compartilhamentos + ",\n Comentários: " + comentarios;
    }
}
