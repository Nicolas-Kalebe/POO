public class Carro extends Terrestre implements Licensiado {
    private String cor;
    private String placa;
    private int marcha;

    public Carro(int capacidade, int velocidade, int numDeRodas, String cor, String placa, int marcha) {
        super(capacidade, velocidade, numDeRodas);
        this.cor = cor;
        this.placa = placa;
        this.marcha = marcha;
    }

    public String getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public int getMarcha() {
        return marcha;
    }

    public void trocarMarcha(int novaMarcha) {
        this.marcha = novaMarcha;
    }

    @Override
    public void emplacar(String placa) {
        this.placa = placa;
    }

    @Override
    public void acelerar() {
        // Implementar lógica de aceleração
    }

    @Override
    public void frear() {
        // Implementar lógica de frenagem
    }
}
