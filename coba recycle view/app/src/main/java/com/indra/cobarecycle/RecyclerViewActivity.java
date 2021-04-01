package com.indra.cobarecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private MahasiswaAdapter mAdapter;
    private RecyclerView rvMahasiswa;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);

        mAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(mAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("indra", "E41192478", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("helmi", "E41192387", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("dika", "E41191344", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("faiz", "E41192110", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("desi", "E4119900", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("farel", "E41192670", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("rizky", "E411925234", "123456789"));
    }
}