package com.example.uts;

public class Transaksi extends Profile{
    private int jumlahSaldo;
    private String pesan;

    public Transaksi(String input_nama, String input_email, String input_alamat, String input_rekening, int jumlahSaldo, String pesan) {
        super(input_nama, input_email, input_alamat, input_rekening);
        this.jumlahSaldo = jumlahSaldo;
        this.pesan = pesan;
    }

    public int getJumlahSaldo() {
        return jumlahSaldo;
    }

    public void setJumlahSaldo(int jumlahSaldo) {
        this.jumlahSaldo = jumlahSaldo;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }
}
