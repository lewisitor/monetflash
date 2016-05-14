package com.example.djlewis.monetflash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class TransactionActivity extends AppCompatActivity {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        listView = (ListView) findViewById(R.id.transactionsListView);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //load up transactions from DB, online or offline
    }
}
