package models;

public class Cliente {
    private String cpf;
    private String nomeCliente;

    public Cliente(String cpf, String nomeCliente) {
        this.cpf = cpf;
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    @Override
    public String toString() {
        return "Cliente: " + this.getCpf() + " - " + this.getNomeCliente();
    }
}
