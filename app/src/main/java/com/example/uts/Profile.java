package com.example.uts;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;


public class Profile extends BaseObservable {
    public String input_nama;
    public String input_email;
    public String input_alamat;
    public String input_rekening;


    public Profile(){}

    public Profile(String input_nama, String input_email, String input_alamat, String input_rekening)

    {
        this.input_nama = input_nama;
        this.input_email = input_email;
        this.input_alamat = input_alamat;
        this.input_rekening = input_rekening;
    }

    @Bindable
    public String getInput_nama() { return input_nama; }

    public void setInput_nama(String input_nama)
    {
        this.input_nama = input_nama;
        notifyPropertyChanged(BR.input_nama);
    }

    @Bindable
    public String getInput_email(){return input_email;}

    public void setInput_email(String input_email)
    {
        this.input_email = input_email;
        notifyPropertyChanged(BR.input_email);
    }

    @Bindable
    public String getInput_alamat(){return input_alamat;}

    public void setInput_alamat(String input_alamat)
    {
        this.input_alamat = input_alamat;
        notifyPropertyChanged(BR.input_alamat);
    }

    @Bindable
    public String getInput_rekening(){return input_rekening;}

    public void setInput_rekening(String input_rekening)
    {
        this.input_rekening=input_rekening;
        notifyPropertyChanged(BR.input_rekening);
    }
}

