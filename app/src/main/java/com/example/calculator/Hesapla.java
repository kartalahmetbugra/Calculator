package com.example.calculator;

import android.widget.EditText;
import android.widget.TextView;

public class Hesapla {
    private  float gelenSayi1, gelenSayi2;
    float sonuc=0.f;

    public Hesapla(float gelenSayi1, float gelenSayi2) {

        this.gelenSayi1 = gelenSayi1;
        this.gelenSayi2 = gelenSayi2;
    }
    public float toplam(){
        return  gelenSayi1+ gelenSayi2;
    }
    public float fark(){
        return gelenSayi1-gelenSayi2;
    }
    public float carp(){
        return gelenSayi1*gelenSayi2;
    }
    public float bol(){
        sonuc=gelenSayi1/gelenSayi2;
        return sonuc;
    }
}
