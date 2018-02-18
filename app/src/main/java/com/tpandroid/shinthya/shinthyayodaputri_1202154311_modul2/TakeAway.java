package com.tpandroid.shinthya.shinthyayodaputri_1202154311_modul2;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {

    private TextInputLayout InputNama,InputNoHp,InputAlamat,InputNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
        //melakukan inisiasi TextInputLayout dengan menggunakan id
        InputNama = (TextInputLayout) findViewById(R.id.NamaPemesan);
        InputNoHp = (TextInputLayout) findViewById(R.id.NoHpPemesan);
        InputAlamat = (TextInputLayout) findViewById(R.id.AlamatPemesan);
        InputNote = (TextInputLayout) findViewById(R.id.NotesPemesanan);

    }

    public void pilihpesan(View view) {

        String nama = InputNama.getEditText().getText().toString();
        String telepon = InputNoHp.getEditText().getText().toString();
        String alamat = InputAlamat.getEditText().getText().toString();
        String catatan = InputNote.getEditText().getText().toString();

        if (nama.isEmpty()|| telepon.isEmpty() || alamat.isEmpty() || catatan.isEmpty()){
            Toast.makeText(this,"Data Belum di Isi",Toast.LENGTH_LONG).show();
        }

        //mengirimkan nama dan jumlah ke dalam intent agar bisa di get pada class yang di tuju
        Intent c = new Intent(TakeAway.this,Menu.class);
        startActivity(c);
    }
    //mengambil method dari DatePickerFragment untuk menampilkan tanggal yang sudah dipilih
    public void onDate(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));
    }

    //mengam method dari TimePickerFragment untuk menampilkan yang sudah di pilih
    public void onTime(View view) {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), getString(R.string.time_picker));
    }

    public void processDatePickerResult(int year, int month, int day) {

        InputNama = (TextInputLayout) findViewById(R.id.NamaPemesan);
        InputNoHp = (TextInputLayout) findViewById(R.id.NoHpPemesan);

        //membuat string nama dana jumlah untuk mengambil nilai dari TextInputLayout
        String nama = InputNama.getEditText().getText().toString();
        String telepon = InputNoHp.getEditText().getText().toString();

        if (nama.isEmpty() || telepon.isEmpty()) {
            Toast.makeText(this, "Data Belum di Isi", Toast.LENGTH_LONG).show();
        } else {

            //Memasukkan bulan pertama dan bulan selanjutnya
            String month_string = Integer.toString(month + 1);
            String day_string = Integer.toString(day);
            String year_string = Integer.toString(year);
            // Assign the concatenated strings to dateMessage.
            String dateMessage = (month_string + "/" + day_string + "/" + year_string);
            Toast.makeText(this, "Atas Nama : " + nama + "\n No Telepon : " + telepon + "\n Akan Mengambil pada : " + dateMessage, Toast.LENGTH_SHORT).show();
        }
    }

    public void processTimePickerResult(int hourOfDay, int minute) {
        //membuat string nama dana jumlah untuk mengambil nilai dari TextInputLayout
        String nama = InputNama.getEditText().getText().toString();
        String telepon = InputNoHp.getEditText().getText().toString();

        if (nama.isEmpty() || telepon.isEmpty()) {
            Toast.makeText(this, "Data Belum di Isi", Toast.LENGTH_LONG).show();
        } else {


            // melakukan convert kedalam waktu
            String hour_string = Integer.toString(hourOfDay);
            String minute_string = Integer.toString(minute);
            String timeMessage = (hour_string + ":" + minute_string);
            Toast.makeText(this, "Atas Nama : " + nama + "\n No Telepon : " + telepon + "\n Akan Mengambil pada : "  + timeMessage, Toast.LENGTH_SHORT).show();
        }
    }
}
