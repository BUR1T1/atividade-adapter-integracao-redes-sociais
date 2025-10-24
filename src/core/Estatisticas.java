package core;


public class Estatisticas {
    private int curtidas;
    private int compartilhamentos;
    private int comentarios;

    public Estatisticas(int curtidas, int compartilhamentos, int comentarios) {
        this.curtidas = curtidas;
        this.compartilhamentos = compartilhamentos;
        this.comentarios = comentarios;
    }

    public int getCompartilhamentos() {
        return compartilhamentos;
    }

    public int getComentarios() {
        return comentarios;
    }

    public int getCurtidas() {
        return curtidas;
    }
}

