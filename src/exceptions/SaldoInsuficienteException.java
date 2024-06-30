package exceptions;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagemSaldoInsuficiente) {
        super(mensagemSaldoInsuficiente);
    }
}
