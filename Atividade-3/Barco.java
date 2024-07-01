public class Barco extends Aquatico {
    private boolean comercial;

    public Barco(int capacidade, int velocidade, String tipo, boolean comercial) {
        super(capacidade, velocidade, tipo);
        this.comercial = comercial;
    }

    public boolean isComercial() {
        return comercial;
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
