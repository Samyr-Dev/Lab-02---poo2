package Principal.Ex5;

public class ContaBancaria {
    public String numeroConta;
    private double saldo;

    public ContaBancaria() {
        this.numeroConta = "123456";
        this.saldo = 123456;
    }

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void exibirSaldo(){
        System.out.println(this.saldo);
    }
}
