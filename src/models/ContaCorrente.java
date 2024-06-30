package models;

public class ContaCorrente extends Conta {

    private static int SEQUENCIAL_CC = 0;

    public ContaCorrente(Cliente cliente) {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numeroConta = SEQUENCIAL_CC + 1;
        super.cliente = cliente;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente");
        super.imprimirDadosComunsExtrato();
    }
}
