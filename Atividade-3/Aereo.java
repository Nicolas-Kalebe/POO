public abstract class Aereo extends Transporte implements Voador {
    private String tipoMotor;

    public Aereo(int capacidade, int velocidade, String tipoMotor) {
        super(capacidade, velocidade);
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    @Override
    public void voar(double tempo) {
        
    }
}

