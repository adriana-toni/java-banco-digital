package models;

import exceptions.SaldoInsuficienteException;

public interface IConta {
    public void sacar(double valor) throws SaldoInsuficienteException;
    public void depositar(double valor);
    public void transferir(IConta contaDestino, double valor) throws SaldoInsuficienteException;
    public void imprimirExtrato();
}
