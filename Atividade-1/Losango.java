public class Losango implements FormaGeometrica {
    private double diagonal1;
    private double diagonal2;
    
    public Losango(double diagonal2, double diagonal1) {
        this.diagonal2 = diagonal2;
        this.diagonal1 = diagonal1;
    }
    
    @Override
    public String getNome() {
        return "Losango";
    }

    @Override
    public double getArea() {
        return (diagonal2*diagonal1)/2 ;
    }

    @Override
    public double getPerimetro() {
        return 2*diagonal2 + 2*diagonal1;
    }
    
    public double getdiagonal2() {
        return diagonal2;
    }
    
    public double getdiagonal1() {
        return diagonal1;
    }

    public void setdiagonal2(double diagonal2) {
        this.diagonal2= diagonal2;
    }
    
    public void setdiagonal1(double diagonal1) {
        this.diagonal1= diagonal1;
    }
}
