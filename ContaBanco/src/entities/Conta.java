package entities;
public class Conta {
    private int numeroConta;
    private String nomeAgencia;
    private String nomeCliente;
    private double saldo;

    public Conta(int numeroConta, String nomeAgencia, String nomeCliente, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeAgencia = nomeAgencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public String exibirBoasVindas() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + nomeAgencia + ", conta " + numeroConta + " e seu saldo R$" + String.format("%.2f", saldo) + " já está disponível para saque.";
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }
}
