package models;

public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL_CP = 0;

    public ContaPoupanca(Cliente cliente) {
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numeroConta = SEQUENCIAL_CP + 1;
        super.cliente = cliente;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupança");
        super.imprimirDadosComunsExtrato();
    }

}
