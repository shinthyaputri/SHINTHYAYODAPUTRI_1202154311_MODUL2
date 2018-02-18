package com.tpandroid.shinthya.shinthyayodaputri_1202154311_modul2;

import android.app.DatePickerDialog;

import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        // menggunakan waktu default yang sekarang terjadi
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it.
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    //membuat takeaway agar tanggal muncul melalui toast yg sudah dibuat pada file TakeAway.java
    @Override
    public void onDateSet(DatePicker view, int year, int month, int day) {

        TakeAway activity = (TakeAway) getActivity();
        activity.processDatePickerResult(year, month, day);

    }
}
