package models;

public class ContaBancaria {
    private double saldo = 5000.00;

    public void depositar(double valor) {
        if (valor > 0) saldo += valor;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
