public abstract class Aquatico extends Transporte {
    private String tipo;

    public Aquatico(int capacidade, int velocidade, String tipo) {
        super(capacidade, velocidade);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
