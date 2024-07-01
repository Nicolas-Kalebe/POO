public class Retangulo implements FormaGeometrica {
    private double base;
    private double altura;
    
    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    @Override
    public String getNome() {
        return "Retangulo";
    }

    @Override
    public double getArea() {
        return altura*base ;
    }

    @Override
    public double getPerimetro() {
        return 2*altura + 2*base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public double getbase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura= altura;
    }
    
    public void setBase(double base) {
        this.base= base;
    }
}
