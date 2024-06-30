package models;

public class Banco {
    private int numeroBanco;
    private String nomeBanco;

    public Banco(int numeroBanco, String nomeBanco) {
        this.numeroBanco = numeroBanco;
        this.nomeBanco = nomeBanco;
    }

    public int getNumeroBanco() {
        return numeroBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
}
