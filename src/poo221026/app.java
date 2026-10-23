package poo221026;

public class app {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        ArmaLaser arma = new ArmaLaser();
        Marciano marciano = new Marciano();

        nave.desenhar();
        arma.desenhar();
        marciano.desenhar();
    }
}
