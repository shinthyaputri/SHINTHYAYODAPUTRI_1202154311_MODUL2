package com.tpandroid.shinthya.shinthyayodaputri_1202154311_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

//untuk menampilkan detail makanan
public class DetailMenu extends AppCompatActivity {
    TextView Text_Makanan, Text_Harga,t_Komposisi;
    ImageView Image_Makanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        Intent intent = getIntent();
        String food = intent.getStringExtra("food");
        Integer price = intent.getIntExtra("price", 0);
        String komposisi= intent.getStringExtra("komposisi");
        Integer photo = intent.getIntExtra("photo", 0);

        Log.d("getIntExtra", "" + price + photo);

        Text_Makanan = (TextView) findViewById(R.id.TextMakanan);
        Text_Harga = (TextView) findViewById(R.id.TextHarga);
        t_Komposisi = (TextView) findViewById(R.id.Text_Komposisi);
        Image_Makanan = (ImageView) findViewById(R.id.ImageMakanan);

        //membuat set data agar sesuai dengan apa yg diklik dan yg sudah dideklarasikan pada file Menu.java
        Text_Makanan.setText(food);
        Text_Harga.setText("Rp. " + price);
        t_Komposisi.setText(komposisi);
        Image_Makanan.setImageResource(photo);
    }
}
