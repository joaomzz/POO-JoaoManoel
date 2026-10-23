package atividade10;

public class Retangulo implements FormaGeometrica {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        System.out.println("Area do Retangulo");
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        System.out.println("Perimetro do Retangulo:");
        return 2 * (largura + altura);
    }
}
