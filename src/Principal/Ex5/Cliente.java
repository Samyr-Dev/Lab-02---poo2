package Principal.Ex5;

public class Cliente {
    protected String nome;
    String cpf;

    public Cliente() {
        this.nome = "Allyson";
        this.cpf = "000.000.000-11";
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirDadosCliente(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }
}
