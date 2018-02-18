package com.tpandroid.shinthya.shinthyayodaputri_1202154311_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private final LinkedList<String> mkomposisi = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new MenuAdapter(this, foods,mkomposisi, priceses, photos) ;
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    //mendeklarasikan isi dari menu terdapat foods (nama makanan), mkomposisi (komposisi makanan),
    // priceses (harga makanan), dan photos (gambar makanan)
    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            foods.add("Meet Lovers");
            foods.add("Splitza Signature");
            foods.add("Super Supreme");
            foods.add("Suprime");
            foods.add("Pasta Pepperoni Cheese Fusilli");

            mkomposisi.add("Pizza yang berisi chicken sosis, chicken luncheon, chicken sticks, keju mozzarella dan saus special PHD");
            mkomposisi.add("Bingung mau pizza American Favourite atau Meat Lovers? Pilih dua-duanya saja, ada dua pilihan topping dalam satu pizza");
            mkomposisi.add("Pizza yang berisi chicken sosis, chicken luncheon, chicken sticks, keju mozzarella dan saus special PHD");
            mkomposisi.add("Pizza dengan topping pepperoni, daging sapi, jamur, nanas, paprika dan keju mozzarella bikin kamu gak sabar buat nyobain");
            mkomposisi.add("Pasta fusili diselimuti saus keju cheddar, bertabur pepperoni sapi dan daun peterseli yang begitu lezat di lidah");


            priceses.add(81000);
            priceses.add(83000);
            priceses.add(79000);
            priceses.add(79000);
            priceses.add(45000);

            photos.add(R.drawable.meetlovers);
            photos.add(R.drawable.splitzasignature);
            photos.add(R.drawable.supersupreme);
            photos.add(R.drawable.supreme);
            photos.add(R.drawable.pasta);


        }
    }
}
