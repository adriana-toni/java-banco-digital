import exceptions.SaldoInsuficienteException;
import models.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("111.111.111-11", "Adriana");

        IConta contaCorrente = new ContaCorrente(cliente);
        IConta contaPoupanca = new ContaPoupanca(cliente);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        contaCorrente.depositar(100);
        try {
            contaCorrente.transferir(contaPoupanca, 50);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        try {
            contaCorrente.transferir(contaPoupanca, 50);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        try {
            contaCorrente.transferir(contaPoupanca, 50);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}