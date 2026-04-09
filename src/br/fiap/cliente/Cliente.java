package br.fiap.cliente;

public class Cliente {
    private int cnpj;
    private String cliente;

    public Cliente(int cnpj, String cliente) {
        this.cnpj = cnpj;
        this.cliente = cliente;
    }

    public int getCnpj() {
        return cnpj;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
