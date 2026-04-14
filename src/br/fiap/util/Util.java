package br.fiap.util;
import br.fiap.carga.Carga;
import br.fiap.cliente.Cliente;
import br.fiap.navio.Navio;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class Util {

    private Navio navio=new Navio();

    public void menu(){
        int opcao;
       do {
           String aux = "Reserva de cargas Boa Viagem\n";
           aux += "[1] Reservar\n";
           aux += "[2] Pesquisar\n";
           aux += "[3] Exibir as cargas\n";
           aux += "[4] Capacidade reservada\n";
           aux += "[5] Cancelar a reservaa\n";
           aux += "[6] Finalizar\n";
           opcao = parseInt(showInputDialog(aux));
           if (opcao < 1 || opcao > 6){
               showMessageDialog(null, "Opção inválida");
           }
           else {
               switch (opcao){
                   case 1 -> reserva();
                   case 3 -> exibir();
                   case 6 -> showMessageDialog(null, "Até breve!");
               }
           }
       }while (opcao!=6);

    }

    private void exibir() {
        showMessageDialog(null, navio.getDados());
    }

    private void reserva() {
        int cnpj;
        String destino,nomeCliente;

        cnpj = parseInt(showInputDialog("cnpj"));
        destino = showInputDialog("Destino");
        nomeCliente = showInputDialog("Cliente");
        Cliente cliente = new Cliente(cnpj, nomeCliente);
        Carga carga = new Carga(destino, cliente);
        if (navio.reserva(carga)){
            showMessageDialog(null,"Carga reservada com sucesso!");
        }
        else {
            showMessageDialog(null, "Problemas ao reservar!");
        }
    }
}
