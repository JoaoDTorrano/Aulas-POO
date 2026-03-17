package br.inatel.cdg;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    Cliente cliente[];
    public Conta() {
        cliente = new Cliente[3];
    }

    public void setCliente(Cliente cliente) {
        for(int i = 0; i < 3; i++){
            this.cliente[i] = cliente;
        }
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public void sacar(float quantia){
        if(getSaldo() >= quantia){
            if(getLimite() >= quantia){
                setSaldo(getSaldo() - quantia);
            }
        }
    }

    public void deposita(float quantia){
        setSaldo(getSaldo() + quantia);
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }
}
