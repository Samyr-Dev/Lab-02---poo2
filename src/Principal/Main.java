package Principal;

import Principal.Ex1e2.Carro;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        Carro c2= new Carro("Volwsvagem", "Fox", 2011, 300000);

        c1.exibirDetalhes();
        System.out.println("-----------------");
        c2.exibirDetalhes();

    }
}