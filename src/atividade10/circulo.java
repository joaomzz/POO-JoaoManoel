package atividade10;

public class circulo implements FormaGeometrica{
    private double raio;

    public circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        System.out.println("Area do circulo");
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("Perimetro do circulo:");
        return 2 * Math.PI * raio;
    }
}
