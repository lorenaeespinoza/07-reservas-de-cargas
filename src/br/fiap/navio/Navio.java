package br.fiap.navio;

import br.fiap.carga.Carga;

public class Navio {
    private double capacidade;
    private int index;
    private Carga [] carga;

    public Navio (){
        this.capacidade = 10000;
        this.carga = new Carga[20];
    }

    public boolean permitidoReserva(double peso){
        double total = 0;
        for (int i = 0; i < index; i ++){
            total += carga[i].getPeso();
        }
        return (total + peso) <= capacidade;
    }

    public boolean reserva (Carga carga){
        if (index < this.carga.length){
            if (permitidoReserva(carga.getPeso())){
                this.carga[index] = carga;
                index++;
                return true;
            }
        }
        return false;
    }

    public String getDados(){
        String aux = "";
        for (int i = 0; i < index; i++){
            aux += carga[i].getDados();
            aux += "######################## \n";
        }
        return  aux;
    }

}
