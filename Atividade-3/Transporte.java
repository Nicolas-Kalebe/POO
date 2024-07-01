public abstract class Transporte implements Movel {
    private int capacidade;
    private int velocidade;

    public Transporte(int capacidade, int velocidade) {
        this.capacidade = capacidade;
        this.velocidade = velocidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
