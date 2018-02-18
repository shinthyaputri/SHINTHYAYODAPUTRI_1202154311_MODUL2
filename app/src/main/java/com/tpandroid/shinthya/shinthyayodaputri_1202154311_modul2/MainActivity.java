package com.tpandroid.shinthya.shinthyayodaputri_1202154311_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //membuat deklarasi ketika kita klik pesan sekarang
    public void onClickOrder(View view) {
        //membuat deklarasi ketika kita pilih button DineIn maka akan muncul toast "Anda telah memilih Dine In" pada class dinein munculnya
        if (((RadioButton) findViewById(R.id.button_DineIn)).isChecked()) {
            Intent intent = new Intent(this, DineIn.class);
            Toast.makeText(this, "Anda telah memilih Dine In", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            //membuat deklarasi ketika kita pilih button TakeAway maka akan muncul toast "Anda telah memilih TakeAway" pada class takeaway munculnya
        } else if (((RadioButton) findViewById(R.id.button_TakeAway)).isChecked()) {
            Intent intent = new Intent(this, TakeAway.class);
            Toast.makeText(this, "Anda telah memilih Take Away", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        } else {
            //membuat deklarasi jika kita klik pesan sekarang, dan tidak mengklik salah satu radio button maka akan muncul toast "pilih salah satu..."
            Toast.makeText(this, "Pilih salah satu terlebih dahulu", Toast.LENGTH_SHORT).show();
        }
    }
}
