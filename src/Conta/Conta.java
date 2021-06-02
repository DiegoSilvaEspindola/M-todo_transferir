package Conta;

public class Conta {
    private Integer numero;
    private int agencia;
    private double saldo;
    private double limite;

    public Conta(Integer numero, int agencia, double saldo, double limite) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo = this.saldo + valor;
        }else{
            System.out.println("Operação não permitida !");
        }
    }

    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo = this.saldo - valor;
        } else{
            System.out.println("Saldo insuficiente !");
        }
    }

     public void tranferir(Conta outra, double valor){
        this.sacar(valor);
        outra.depositar(valor);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return this.saldo + this.limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", agencia=" + agencia +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
