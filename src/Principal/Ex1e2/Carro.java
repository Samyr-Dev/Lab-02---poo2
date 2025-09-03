package Principal.Ex1e2;

public class Carro {
    public String marca;
    protected String modelo;
    int ano;
    private double preco;

    public Carro() {
        this.marca = "Chevrollet";
        this.modelo = "Classic";
        this.ano = 2011;
        this.preco = 20.000;
    }

    public Carro(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public void exibirDetalhes(){
    System.out.println(this.marca);
    System.out.println(this.modelo);
    System.out.println(this.ano);
    System.out.println(this.preco);
}

}
