package br.inatel.cdg.exercicio2;

import br.inatel.cdg.exercicio2.exceptions.SaldoInsuficienteException;

import java.util.*;

public class Conta {

    private float saldo;
    private float limite;
    private Set<Cliente> clientes = new HashSet<>();


    public Conta(float saldo, float limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostraInfo() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);


        for (Cliente cliente : clientes) {
            try {
                System.out.println("Nome do cliente: " + cliente.getNome());
                System.out.println("CPF do cliente: " + cliente.getCpf());
            } catch (NullPointerException e) {
                System.out.println("Nao existe cliente nessa posicao");
            }
        }
    }

    public void sacar(double quantia) {
        if (quantia < (saldo + limite)) {
            this.saldo -= quantia;
        } else {
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
    }
}