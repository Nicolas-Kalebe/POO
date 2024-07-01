public class Teste {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[5];

        formas[0] = new Quadrado(5,4);
        formas[1] = new Circulo(3);
        formas[2] = new Retangulo(4,6);
        formas[3] = new Losango(4,6);
        formas[4] = new Triangulo(4,6,4);
        
        for (int i=0;i<5;i++) {
            System.out.println("Área: " + formas[i].getArea());
            System.out.println("Perímetro: " + formas[i].getPerimetro());
        }
    }
}
