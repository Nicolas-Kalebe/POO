public abstract class Terrestre extends Transporte {
    private int numDeRodas;

    public Terrestre(int capacidade, int velocidade, int numDeRodas) {
        super(capacidade, velocidade);
        this.numDeRodas = numDeRodas;
    }

    public int getNumDeRodas() {
        return numDeRodas;
    }
}

