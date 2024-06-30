package models;

import exceptions.SaldoInsuficienteException;

public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (this.getSaldo() < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(IConta contaDestino, double valor) throws SaldoInsuficienteException {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirDadosComunsExtrato() {
        System.out.printf("Agência: %d - Conta: %d \n", this.getAgencia(), this.getNumeroConta());
        System.out.println(this.getCliente().toString());
        System.out.printf("Saldo disponível = %.2f \n", this.getSaldo());
        System.out.println("*****\n");
    }

}
