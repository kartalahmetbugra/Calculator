package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText sayi1, sayi2;
    TextView sonuc;
    double sonuc2 = 0.000;
    String sonuc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sonuc = (TextView) findViewById(R.id.textView2);
        sayi1 = (EditText) findViewById(R.id.sayi1);
        sayi2 = (EditText) findViewById(R.id.sayi2);
        sonuc.setVisibility(View.INVISIBLE);

    }

    public void btnHesapla(View v) {
        String birinciSayi = sayi1.getText().toString();
        String iknciSayi = sayi2.getText().toString();

        if (!TextUtils.isEmpty(birinciSayi) && !TextUtils.isEmpty(iknciSayi)) {
            float s1 = Float.valueOf(birinciSayi);
            float s2 =Float.valueOf(iknciSayi);
            Hesapla hesapla = new Hesapla(s1, s2);
            switch (v.getId()) {
                case R.id.btntopla:
                    sonuc2 = hesapla.toplam();
                    sonuc.setVisibility(View.VISIBLE);
                    sonuc.setText("Sonuç: " + sonuc2);
                    break;
                case R.id.btnCıkar:
                    sonuc2 = hesapla.fark();
                    sonuc.setVisibility(View.VISIBLE);
                    sonuc.setText("Sonuç: " + sonuc2);
                    break;
                case R.id.btnCarp:
                    sonuc2 = hesapla.carp();
                    sonuc.setVisibility(View.VISIBLE);
                    sonuc.setText("Sonuç: " + sonuc2);
                    break;
                case R.id.btnbol:
                    hesapla.bol();
                    sonuc2= hesapla.sonuc;
                    sonuc3=String.valueOf(sonuc2);
                    System.out.println(sonuc3);
                    sonuc.setVisibility(View.VISIBLE);
                    sonuc.setTextSize(1,40);
                    sonuc.setText("Sonuç: " + sonuc3.substring(0,7));
                    break;
            }



        } else {
            sonuc.setVisibility(View.VISIBLE);
            sonuc.setTextSize(35);
            sonuc.setText("Lütfen sayıları kontrol ediniz");

        }

    }
}