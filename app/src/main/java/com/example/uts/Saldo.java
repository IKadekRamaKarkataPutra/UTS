package com.example.uts;

public class Saldo extends Profile{
    private int saldo;

    public Saldo(String input_nama, String input_email, String input_alamat, String input_rekening, int saldo) {
        super(input_nama, input_email, input_alamat, input_rekening);
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}