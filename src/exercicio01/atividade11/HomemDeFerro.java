package exercicio01.atividade11;

public class HomemDeFerro implements atacante, voador {
    @Override
    public void golpear() {
        System.out.println("Homem de Ferro golpeando");
    }

    @Override
    public void voar() {
        System.out.println("Homem de Ferro voando");
    }


}