package exercicio02.atividade11;

public class app {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();

        Ligavel tv = new Televisao();
        Ligavel lampada = new LampadaInteligente();

        controle.pressionarBotao(tv);
        controle.pressionarBotao(lampada);
    }
}
