class Personagem {
    private String nome;
    private int vida;
    private int poderDeAteque;

    public Personagem(String nome, int vida, int poderDeAteque) {
        this.nome = nome;
        this.vida = vida;
        this.poderDeAteque = poderDeAteque;
    }

    public void atacarAlvo(Personagem alvo) {
        System.out.println(nome + "atacou" + alvo.nome);
        alvo.receberDano(poderDeAteque);
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) {
            vida = 0;
        }

        System.out.println(nome + "recebeu" + dano + "de dano");
        System.out.println("vida atual: "+ vida);
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getPoderDeAteque() {
        return poderDeAteque;
    }

    public void setPoderDeAteque(int poderDeAteque) {
        this.poderDeAteque = poderDeAteque;
    }
}
class Guerreiro extends Personagem {
    private int escudo;

    public Guerreiro(String nome, int vida, int poderDeAteque, int escudo) {
        super(nome, vida, poderDeAteque);
        this.escudo = escudo;
    }

    public void usarSuperForca() {
        setPoderDeAteque(getPoderDeAteque() + 10);
        System.out.println(getNome() + "Usou super força!" + "----Poder de ataque:" + getPoderDeAteque());
    }

    @Override
    public void receberDano(int dano) {
        int danoFinal = dano - escudo;
        if (danoFinal < 0) {
            danoFinal = 0;
        }

        super.receberDano(danoFinal);
    }
}

class Mago extends Personagem{
    private int mana;

    public Mago(String nome, int vida, int poderDeAtaque, int mana) {
        super(nome, vida, poderDeAtaque);
        this.mana = mana;
    }

    public void lancarBolaDeFogo(Personagem alvo) {
        if (mana >= 10) {
            mana -= 10;

            System.out.println(getNome() + " lançou uma Bola de Fogo!");
            alvo.receberDano(getPoderDeAteque() + 15);
            System.out.println("magia mana restante: " + mana);
        } else {
            System.out.println("Mana insuficiente!");
        }
    }
}

public class problema02 {
    public static void main (String[] args) {
        Guerreiro guerreiro01 = new Guerreiro("Manel", 100, 25, 15);
        Mago mago01 = new Mago("Besta fugana", 100, 25, 15);

        guerreiro01.atacarAlvo(mago01);
        mago01.lancarBolaDeFogo(guerreiro01);
        guerreiro01.usarSuperForca();
        mago01.atacarAlvo(guerreiro01);

    }
}
