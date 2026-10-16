class componenteEletrico {
    public String nome;

    public componenteEletrico(String nome) {
        this.nome = nome;
    }

    public float potencia() {
        return 0;
    }
}

class Resistor extends componenteEletrico {
    public float resistencia;
    public float corrente;

    public Resistor(String nome, float resistencia, float corrente) {
        super(nome);
        this.resistencia = resistencia;
        this.corrente = corrente;
    }

    @Override
    public float potencia() {
        return (corrente * corrente) * resistencia;
    }
}

class Capacitor extends componenteEletrico {
    public float capacidade;
    public float tensao;

    public Capacitor(String nome, float capacidade, float tensao) {
        super(nome);
        this.capacidade = capacidade;
        this.tensao = tensao;
    }

    @Override
    public float potencia() {
        return 0;
    }
}

public class problema01  {
    public static void main(String[] args) {
        Resistor resistor02 = new Resistor("pancada", 12, 3);
        Capacitor capacitor02 = new Capacitor("pipoco", 12, 3);

        System.out.println(resistor02.potencia());
        System.out.println(capacitor02.potencia());
    }
}