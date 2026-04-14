package br.fiap.carga;

import br.fiap.cliente.Cliente;

import java.text.DecimalFormat;
import java.util.Random;

public class Carga {
    private int id;
    private String destino;
    private double peso;
    private Cliente cliente;

    public Carga(String destino, Cliente cliente) {
        Random random = new Random();
        this.destino = destino;
        this.cliente = cliente;
        this.id = random.nextInt(1000,9999);
        this.peso = random.nextDouble(1000,5000);
    }

    public String getDados(){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        String aux = "";
        aux += "ID: "+id+ "\n";
        aux += "Destino: "+destino+ "\n";
        aux += "Peso em kg: " +df.format(peso)+ "\n";
        aux += cliente.getDados();
        return aux;

    }

    public int getId() {
        return id;
    }

    public String getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
