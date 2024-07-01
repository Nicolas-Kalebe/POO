public class Aviao extends Aereo {
    private String tipo;
    private boolean comercial;

    public Aviao(int capacidade, int velocidade, String tipoMotor, String tipo, boolean comercial) {
        super(capacidade, velocidade, tipoMotor);
        this.tipo = tipo;
        this.comercial = comercial;
    }

    public String getTipo() {
        return tipo;
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

    @Override
    public void voar(double tempo) {
        // Implementar lógica de voo
    }
}
