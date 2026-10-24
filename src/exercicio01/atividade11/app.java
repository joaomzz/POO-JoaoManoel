package exercicio01.atividade11;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args) {
        HomemAranha homemAranha = new HomemAranha();
        HomemDeFerro homemDeFerro = new HomemDeFerro();
        passaro passaro = new passaro();


        List<voador> voadores = new ArrayList<>();
        voadores.add(passaro);
        voadores.add(homemDeFerro);

        List<atacante> atacantes = new ArrayList<>();
        atacantes.add(homemAranha);
        atacantes.add(homemDeFerro);


        System.err.println("\nGrupo Voadores");
        for (voador voador : voadores) {
            System.out.println("\nVoadore: "+ voador);
            voador.voar();

        }

        System.out.println("\nGrupo Atacantes");
        for(atacante atacante : atacantes) {
            System.out.println("\nAtacante: "+ atacante);
            atacante.golpear();
        }





    }

}
