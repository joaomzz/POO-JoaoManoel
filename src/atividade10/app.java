package atividade10;

public class app {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(20, 10);
        circulo circulo = new circulo(10);

        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());

        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());
    }
}
